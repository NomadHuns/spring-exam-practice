package shop.mtcoding.scripttestcoding.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/*  id int auto_increment primary key,
    username varchar not null unique,
    password varchar not null,
    email varchar not null,
    created_at timestamp
 */

@Getter
@Setter
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;
}
