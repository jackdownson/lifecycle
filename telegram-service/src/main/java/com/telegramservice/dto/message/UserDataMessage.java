package com.telegramservice.dto.message;

import com.telegramservice.dto.UserDataDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDataMessage {

    private String messageId;
    private UserDataDto userDataDto;
    private Date messageDate;

}
