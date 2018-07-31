package com.dsm.ibracelet.bean;

import java.util.Arrays;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/30 15 53 星期一<br>
 * 功能描述：闹钟<br>
 */
public class AlarmClock {
    private int alarmID;//闹钟 ID： 1 ~ 5，最多支持5个闹钟
    private boolean isOn;//是否开启
    private boolean lazyMode;//懒人模式
    private int hour;//小时
    private int minute;//分钟
    private Boolean[] enableDaysInWeek;//每周开启天的标记 依次为 sun. mon. thu. wed. thu. fri. sat. 的开启状态 如：周一 ~ 五 开启，则为：[false, true, true, true, true, true, false]
    private int lightSleepSeconds;//浅睡眠提醒秒数。会在闹钟时间前 x 秒内的浅睡眠提前振动。如设置了 600s，即为 10 分钟，闹钟时间在 8:00，则会在 7:50 ~ 8:00 之间的浅睡眠中振动

    public int getAlarmID() {
        return alarmID;
    }

    public AlarmClock setAlarmID(int alarmID) {
        this.alarmID = alarmID;
        return this;
    }

    public boolean isOn() {
        return isOn;
    }

    public AlarmClock setOn(boolean on) {
        isOn = on;
        return this;
    }

    public boolean isLazyMode() {
        return lazyMode;
    }

    public AlarmClock setLazyMode(boolean lazyMode) {
        this.lazyMode = lazyMode;
        return this;
    }

    public int getHour() {
        return hour;
    }

    public AlarmClock setHour(int hour) {
        this.hour = hour;
        return this;
    }

    public int getMinute() {
        return minute;
    }

    public AlarmClock setMinute(int minute) {
        this.minute = minute;
        return this;
    }

    public Boolean[] getEnableDaysInWeek() {
        return enableDaysInWeek;
    }

    public AlarmClock setEnableDaysInWeek(Boolean[] enableDaysInWeek) {
        this.enableDaysInWeek = enableDaysInWeek;
        return this;
    }

    public int getLightSleepSeconds() {
        return lightSleepSeconds;
    }

    public AlarmClock setLightSleepSeconds(int lightSleepSeconds) {
        this.lightSleepSeconds = lightSleepSeconds;
        return this;
    }

    @Override
    public String toString() {
        return "AlarmClock{" + "alarmID=" + alarmID + ", isOn=" + isOn + ", lazyMode=" + lazyMode + ", hour=" + hour + ", minute=" + minute + ", enableDaysInWeek=" + Arrays.toString(enableDaysInWeek) + ", lightSleepSeconds=" + lightSleepSeconds + '}';
    }
}
