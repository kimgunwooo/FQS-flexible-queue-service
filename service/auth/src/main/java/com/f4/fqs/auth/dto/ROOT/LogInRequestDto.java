package com.f4.fqs.auth.dto.ROOT;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LogInRequestDto {
    @NotBlank(message = "이메일을 입력하지 않았습니다.")
    private String email;

    @NotBlank(message = "비밀번호를 입력하지 않았습니다.")
    private String password;

}
