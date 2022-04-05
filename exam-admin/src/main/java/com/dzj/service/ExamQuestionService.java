package com.dzj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dzj.entity.ExamQuestion;

/**
 * @author by dzj
 * @implNote 2021/10/20 9:04
 */
public interface ExamQuestionService extends IService<ExamQuestion> {

    ExamQuestion getExamQuestionByExamId(Integer examId);

}
