package com.dzj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dzj.entity.ExamQuestion;
import com.dzj.mapper.ExamQuestionMapper;
import com.dzj.service.ExamQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author by dzj
 * @implNote 2021/10/20 9:05
 */
@Service
@RequiredArgsConstructor
public class ExamQuestionServiceImpl extends ServiceImpl<ExamQuestionMapper, ExamQuestion> implements ExamQuestionService {

    private final ExamQuestionMapper examQuestionMapper;

    @Override
    public ExamQuestion getExamQuestionByExamId(Integer examId) {
        return examQuestionMapper.selectOne(new QueryWrapper<ExamQuestion>().eq("exam_id", examId));
    }
}
