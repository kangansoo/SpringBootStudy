package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
    @NotEmpty(message = "내용은 필수항목입니다.")
    @Size(min=3, max=1000, message="내용은 1000글자 이하로 작성하셔야 합니다.")
    private String content;
}