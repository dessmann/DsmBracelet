package com.dsm.ibracelet.bean;

/**
 * 作者：德施曼<br>
 * 创建时间：2018/7/17 14 15 星期二<br>
 * 功能描述：运动的时间线数据<br>
 */
public class TimeLine {
    /**
     * 运动的开始时间
     */
    private Long startMillis;
    /**
     * 运动的结束时间
     */
    private Long endMillis;
    /**
     * 消耗的能量，单位：大卡
     */
    private Float energy;
    /**
     * 如果code表示的运动类型是散步，则为具体步数
     */
    private Integer steps;
    /**
     * 具体的运动类型 0 未佩戴手环 1 充电 2 浅睡眠 3 深睡眠 4 清醒 5 静 6 活动 7 散步 8 坐车 9 热身 10 健走 11 跑步 12 运动 13 游泳 14 自行车 15 健身 16 羽毛球
     */
    private Integer code;

    public Long getStartMillis() {
        return startMillis;
    }

    public TimeLine setStartMillis(Long startMillis) {
        this.startMillis = startMillis;
        return this;
    }

    public Long getEndMillis() {
        return endMillis;
    }

    public TimeLine setEndMillis(Long endMillis) {
        this.endMillis = endMillis;
        return this;
    }

    public Float getEnergy() {
        return energy;
    }

    public TimeLine setEnergy(Float energy) {
        this.energy = energy;
        return this;
    }

    public Integer getSteps() {
        return steps;
    }

    public TimeLine setSteps(Integer steps) {
        this.steps = steps;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public TimeLine setCode(Integer code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {
        return "TimeLine{" + "startMillis=" + startMillis + ", endMillis=" + endMillis + ", energy=" + energy + ", steps=" + steps + ", code=" + code + '}';
    }
}
