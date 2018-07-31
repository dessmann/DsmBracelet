package com.dsm.ibracelet.bean;

import java.util.Arrays;

/**
 * 作者：德施曼<br>
 * 创建时间：2018/7/30 15 47 星期一<br>
 * 功能描述：久坐提醒<br>
 */
public class StandReminder {
    /**
     * 开关 true 开启 false 关闭
     */
    private boolean isOn;
    /**
     * 开始时间的小时
     */
    private int beginHour;
    /**
     * 开始时间的分钟
     */
    private int beginMinute;
    /**
     * 结束时间的小时
     */
    private int endHour;
    /**
     * 结束时间的分钟
     */
    private int endMinute;
    /**
     * 每周开启天的标记 Bool 数组，依次为 sun. mon. the. wed. thu. fri. sat 如：周一 ~ 五 开启，则为：[false, true, true, true, true, true, false]
     */
    private Boolean[] enableWeekDays;

    public boolean isOn() {
        return isOn;
    }

    public StandReminder setOn(boolean on) {
        isOn = on;
        return this;
    }

    public int getBeginHour() {
        return beginHour;
    }

    public StandReminder setBeginHour(int beginHour) {
        this.beginHour = beginHour;
        return this;
    }

    public int getBeginMinute() {
        return beginMinute;
    }

    public StandReminder setBeginMinute(int beginMinute) {
        this.beginMinute = beginMinute;
        return this;
    }

    public int getEndHour() {
        return endHour;
    }

    public StandReminder setEndHour(int endHour) {
        this.endHour = endHour;
        return this;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public StandReminder setEndMinute(int endMinute) {
        this.endMinute = endMinute;
        return this;
    }

    public Boolean[] getEnableWeekDays() {
        return enableWeekDays;
    }

    public StandReminder setEnableWeekDays(Boolean[] enableWeekDays) {
        this.enableWeekDays = enableWeekDays;
        return this;
    }

    @Override
    public String toString() {
        return "StandReminder{" + "isOn=" + isOn + ", beginHour=" + beginHour + ", beginMinute=" + beginMinute + ", endHour=" + endHour + ", endMinute=" + endMinute + ", enableWeekDays=" + Arrays.toString(enableWeekDays) + '}';
    }
}
