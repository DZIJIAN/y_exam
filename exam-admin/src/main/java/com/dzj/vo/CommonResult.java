package com.dzj.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dzj
 * @implNote 2021/10/20 08:54
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    @Builder.Default
    private Integer code = 200;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
