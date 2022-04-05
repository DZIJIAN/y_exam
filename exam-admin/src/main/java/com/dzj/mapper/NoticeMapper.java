package com.dzj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dzj.entity.Notice;
import org.springframework.stereotype.Repository;

/**
 * @author by dzj
 * @implNote 2021/10/20 8:59
 */
@Repository
public interface NoticeMapper extends BaseMapper<Notice> {

    // 将所有公告设置为历史公告
    boolean setAllNoticeIsHistoryNotice();

}
