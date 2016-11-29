package com.pandawork.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 通知公告类型枚举类
 * Created by fujia on 2016/11/29.
 */
public enum NoticeTypeEnums {

    SchoolNews(1, "学校新闻"),
    NoticeAndAnnouncement(2, "通知公告"),
    AcademicActivities(3, "学术活动");

    private Integer id;

    private String name;

    NoticeTypeEnums(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private static Map<Integer, NoticeTypeEnums> map = new HashMap<Integer, NoticeTypeEnums>();

    static {
        for (NoticeTypeEnums enums : NoticeTypeEnums.values()) {
            map.put(enums.getId(), enums);
        }
    }

    public static NoticeTypeEnums valueOf(int id) {
        return valueOf(id, null);
    }

    public static NoticeTypeEnums valueOf(int id, NoticeTypeEnums defaultValue) {
        NoticeTypeEnums enums = map.get(id);
        return enums == null ? defaultValue : enums;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
