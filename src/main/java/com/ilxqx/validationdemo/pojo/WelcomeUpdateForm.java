package com.ilxqx.validationdemo.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * welcome update form
 *
 * @author venus
 * @version 1.0.0
 * @since 2023/3/24 星期五 22:34
 */
@Data
public class WelcomeUpdateForm {

    @NotBlank(message = "名称不能为空！")
    private String name;

    @NotBlank(message = "描述不能为空！")
    private String description;

    @NotNull(message = "欢迎的次数不能为空！")
    private Integer max;
}
