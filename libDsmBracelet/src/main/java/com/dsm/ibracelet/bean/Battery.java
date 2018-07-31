package com.dsm.ibracelet.bean;

/**
 * 作者：德施曼<br>
 * 创建时间：2018/7/30 13 16 星期一<br>
 * 功能描述：手环电量<br>
 */
public class Battery {
    /**
     * 电量值
     */
    private Float batteryValue;
    /**
     * 电量百分比
     */
    private Float batteryPercent;

    public Float getBatteryValue() {
        return batteryValue;
    }

    public Battery setBatteryValue(Float batteryValue) {
        this.batteryValue = batteryValue;
        return this;
    }

    public Float getBatteryPercent() {
        return batteryPercent;
    }

    public Battery setBatteryPercent(Float batteryPercent) {
        this.batteryPercent = batteryPercent;
        return this;
    }

    @Override
    public String toString() {
        return "Battery{" + "batteryValue=" + batteryValue + ", batteryPercent=" + batteryPercent + '}';
    }
}
