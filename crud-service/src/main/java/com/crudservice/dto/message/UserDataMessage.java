package com.crudservice.dto.message;

import com.crudservice.domain.UserData;
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
    private Date messageDate;
    private UserData userData;

}
