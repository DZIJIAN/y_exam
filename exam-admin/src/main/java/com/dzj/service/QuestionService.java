package com.dzj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dzj.entity.Question;
import com.dzj.vo.PageResponse;
import com.dzj.vo.QuestionVo;

/**
 * @author by dzj
 * @implNote 2021/10/20 9:04
 */
public interface QuestionService extends IService<Question> {

    PageResponse<Question> getQuestion(String questionType, String questionBank, String questionContent, Integer pageNo, Integer pageSize);

    QuestionVo getQuestionVoById(Integer id);

    void deleteQuestionByIds(String questionIds);

    void addQuestion(QuestionVo questionVo);

    void updateQuestion(QuestionVo questionVo);

}
