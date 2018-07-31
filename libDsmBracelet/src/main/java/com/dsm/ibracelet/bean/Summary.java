package com.dsm.ibracelet.bean;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/17 14 18 星期二<br>
 * 功能描述：简要数据<br>
 */
public class Summary {
    /*{//运动基本统计数据
        "distance":209.8,//行走距离
        "steps":300,//行走步数
        "sleepScore":5.2,//睡眠质量，大于4.5为优，大于3小于4.5为良，3以下为一般 范围 0-8 刻度0.1
        "sleepMinutes":205,//睡眠时长，单位为分钟，最大值为480
        "energyinkcal":103//消耗能量，单位为大卡，最大值200
    }*/
    private Float distance;
    private Integer steps;
    private Float sleepScore;
    private Integer sleepMinutes;
    private Integer energyinkcal;

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

    public Integer getEnergyinkcal() {
        return energyinkcal;
    }

    public Summary setEnergyinkcal(Integer energyinkcal) {
        this.energyinkcal = energyinkcal;
        return this;
    }

    @Override
    public String toString() {
        return "Summary{" + "distance=" + distance + ", steps=" + steps + ", sleepScore=" + sleepScore + ", sleepMinutes=" + sleepMinutes + ", energyinkcal=" + energyinkcal + '}';
    }
}
