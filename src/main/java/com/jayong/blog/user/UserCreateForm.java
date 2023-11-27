package com.jayong.blog.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max =25)
    @NotEmpty(message = "ID는 입력해야지.")
    private String username;

    @NotEmpty(message = "뭐라도 입력해야지.")
    private String password1;

    @NotEmpty(message = "맞는지 확인해야지?")
    private String password2;

    @NotEmpty(message = "이메일도 입력하래.")
    @Email
    private String email;
}
