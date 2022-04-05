package com.dzj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dzj.entity.Notice;
import com.dzj.vo.PageResponse;

/**
 * @author by dzj
 * @implNote 2021/10/20 9:04
 */
public interface NoticeService extends IService<Notice> {
    // 将所有公告设置为历史公告
    boolean setAllNoticeIsHistoryNotice();

    String getCurrentNotice();

    PageResponse<Notice> getAllNotices(String content, Integer pageNo, Integer pageSize);

    void publishNotice(Notice notice);

    void deleteNoticeByIds(String noticeIds);

    void updateNotice(Notice notice);
}
