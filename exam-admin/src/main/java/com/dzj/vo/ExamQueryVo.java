package com.dzj.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author by dzj
 * @implNote 2021/11/1 17:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamQueryVo {

    private Integer examType;

    private String startTime;

    private String endTime;

    private String examName;

    @NotNull
    private Integer pageNo;

    @NotNull
    private Integer pageSize;

}
