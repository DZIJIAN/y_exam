package com.dzj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dzj.entity.Exam;
import com.dzj.vo.AddExamByBankVo;
import com.dzj.vo.AddExamByQuestionVo;
import com.dzj.vo.ExamQueryVo;
import com.dzj.vo.PageResponse;

import java.util.List;

/**
 * @author by dzj
 * @implNote 2021/10/20 9:04
 */
public interface ExamService extends IService<Exam> {

    PageResponse<Exam> getExamPage(ExamQueryVo examQueryVo);

    AddExamByQuestionVo getExamInfoById(Integer examId);

    void operationExam(Integer type, String ids);

    void addExamByBank(AddExamByBankVo addExamByBankVo);

    void addExamByQuestionList(AddExamByQuestionVo addExamByQuestionVo);

    void updateExamInfo(AddExamByQuestionVo addExamByQuestionVo);

    List<String> getExamPassRateEchartData();

    List<String> getExamNumbersEchartData();
}
