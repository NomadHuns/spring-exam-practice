package shop.mtcoding.scripttestcoding.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import shop.mtcoding.scripttestcoding.model.User;
import shop.mtcoding.scripttestcoding.model.UserRepository;
import shop.mtcoding.scripttestcoding.util.Script;

@Controller
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;
    private HttpSession session;

    @GetMapping("/login-form")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/join-form")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/user/update-form")
    public String updateForm() {
        return "user/updateForm";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user == null) {
            return Script.back("아이디, 비밀번호를 확인해 주세요.");
        }
        session.setAttribute("principal", user);
        return Script.forword(username + "님, 로그인 되었습니다.", "/board/list");
    }
}
