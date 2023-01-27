<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ include file="../layout/header.jsp" %>
    <div class="align_center_box">
        <h1>회원가입 페이지</h1>
    </div>
    <%@ include file="../layout/navigator.jsp" %>
    <div class="align_center_box">
        <form action="/join" method="post">
            <input type="text" name="username" placeholder="Enter username" required><br>
            <input type="password" name="password" placeholder="Enter password" required><br>
            <input type="email" name="email" placeholder="Enter email" required><br>
            <div class="align_right_box">
                <button type="submit">회원가입</button>
            </div>
        </form>
    </div>
    <%@ include file="../layout/footer.jsp" %>