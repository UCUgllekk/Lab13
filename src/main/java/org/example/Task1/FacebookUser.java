package org.example.Task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String userMail;
    private String country;
    private long lastActiveTime;
}
