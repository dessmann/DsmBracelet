package com.dsm.ibracelet.bean;

/**
 * 作者：德施曼<br>
 * 创建时间：2018/7/17 14 18 星期二<br>
 * 功能描述：简要数据<br>
 */
public class Summary {
    /**
     * 行走距离
     */
    private Float distance;
    /**
     * 行走步数
     */
    private Integer steps;
    /**
     * 睡眠质量，大于4.5为优，大于3小于4.5为良，3以下为一般 范围 0-8 刻度0.1
     */
    private Float sleepScore;
    /**
     * 睡眠时长，单位为分钟，最大值为480
     */
    private Integer sleepMinutes;
    /**
     * 消耗能量，单位为大卡，最大值200
     */
    private Float energyinkcal;

    public Float getDistance() {
        return distance;
    }

    public Summary setDistance(Float distance) {
        this.distance = distance;
        return this;
    }

    public Integer getSteps() {
        return steps;
    }

    public Summary setSteps(Integer steps) {
        this.steps = steps;
        return this;
    }

    public Float getSleepScore() {
        return sleepScore;
    }

    public Summary setSleepScore(Float sleepScore) {
        this.sleepScore = sleepScore;
        return this;
    }

    public Integer getSleepMinutes() {
        return sleepMinutes;
    }

    public Summary setSleepMinutes(Integer sleepMinutes) {
        this.sleepMinutes = sleepMinutes;
        return this;
    }

    public Float getEnergyinkcal() {
        return energyinkcal;
    }

    public Summary setEnergyinkcal(Float energyinkcal) {
        this.energyinkcal = energyinkcal;
        return this;
    }

    @Override
    public String toString() {
        return "Summary{" + "distance=" + distance + ", steps=" + steps + ", sleepScore=" + sleepScore + ", sleepMinutes=" + sleepMinutes + ", energyinkcal=" + energyinkcal + '}';
    }
}
