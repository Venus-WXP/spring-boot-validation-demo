package com.ilxqx.validationdemo.pojo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

/**
 * update form wrapper
 *
 * @author venus
 * @version 1.0.0
 * @since 2023/3/24 星期五 23:10
 */
@Data
public class WelcomeUpdateFormWrapper {

    @NotEmpty(message = "要创建的数据不能为空")
    private List<@Valid WelcomeUpdateForm> updateForms;
}
