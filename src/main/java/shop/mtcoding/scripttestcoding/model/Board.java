package shop.mtcoding.scripttestcoding.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/*  id int auto_increment primary key,
    title varchar not null,
    user_id int not null,
    created_at timestamp
 */

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private Integer userId;
    private Timestamp createdAt;
}
