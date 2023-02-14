package com.ink42.basicMangoServer.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data
@Document(collation = "users")

public class userClass {
    @Id
    private int id;
    private String username;
    private String email;
    private String bio;
    private String profile_image_url;
    private LocalDate created_at;
    private LocalDate updated_at;

}
