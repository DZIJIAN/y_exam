package com.dzj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dzj.entity.Answer;
import com.dzj.mapper.AnswerMapper;
import com.dzj.service.AnswerService;
import org.springframework.stereotype.Service;

/**
 * @Date 2021/10/20 9:05
 * @created by dzj
 */
@Service
public class AnswerServiceImpl extends ServiceImpl<AnswerMapper, Answer> implements AnswerService {
}
