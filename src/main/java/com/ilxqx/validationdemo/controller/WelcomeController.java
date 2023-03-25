package com.ilxqx.validationdemo.controller;

import com.ilxqx.validationdemo.pojo.Result;
import com.ilxqx.validationdemo.pojo.WelcomeUpdateForm;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * welcome controller
 *
 * @author venus
 * @version 1.0.0
 * @since 2023/3/24 星期五 22:30
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/hello")
    public Result printHello() {
        return Result.of(0, "Hello, venus");
    }

    @PostMapping("/hello")
    public Result batchCreateWelcome(@RequestBody @Validated List<WelcomeUpdateForm> updateForms) {
        // 模拟保存操作

        for (WelcomeUpdateForm updateForm : updateForms) {
            System.out.println(updateForm);
        }

        return Result.of(0, "批量保存成功！");
    }
}
