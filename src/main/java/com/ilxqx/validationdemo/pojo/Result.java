package com.ilxqx.validationdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * result
 *
 * @author venus
 * @version 1.0.0
 * @since 2023/3/24 星期五 22:32
 */
@Data
@AllArgsConstructor(staticName = "of")
public class Result {

    private int code;

    private String message;
}
