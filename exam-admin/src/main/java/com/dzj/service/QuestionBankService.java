package com.dzj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dzj.entity.QuestionBank;
import com.dzj.vo.BankHaveQuestionSum;
import com.dzj.vo.PageResponse;
import com.dzj.vo.QuestionVo;

import java.util.List;

/**
 * @author by dzj
 * @implNote 2021/10/20 9:04
 */
public interface QuestionBankService extends IService<QuestionBank> {

    PageResponse<BankHaveQuestionSum> getBankHaveQuestionSumByType(String bankName, Integer pageNo, Integer pageSize);

    List<QuestionVo> getQuestionsByBankId(Integer bankId);

    List<QuestionVo> getQuestionByBankIdAndType(Integer bankId, Integer type);

    List<QuestionBank> getAllQuestionBanks();

    void addQuestionToBank(String questionIds, String banks);

    void removeBankQuestion(String questionIds, String banks);

    void deleteQuestionBank(String ids);

    void addQuestionBank(QuestionBank questionBank);
}
