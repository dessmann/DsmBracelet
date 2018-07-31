package com.dsm.ibracelet.bean;

import java.util.List;

/**
 * 作者：德施曼<br>
 * 创建时间：2018/7/17 14 11 星期二<br>
 * 功能描述：手环的运动数据<br>
 */
public class BraceletSport {
    /**
     * 运动时间线数据,参考{@link TimeLine}
     */
    private List<TimeLine> timeLineData;
    /**
     * 运动基本统计数据,参考{@link Summary}
     */
    private Summary sumData;

    public List<TimeLine> getTimeLineData() {
        return timeLineData;
    }

    public BraceletSport setTimeLineData(List<TimeLine> timeLineData) {
        this.timeLineData = timeLineData;
        return this;
    }

    public Summary getSumData() {
        return sumData;
    }

    public BraceletSport setSumData(Summary sumData) {
        this.sumData = sumData;
        return this;
    }

    @Override
    public String toString() {
        return "BraceletSport{" + "timeLineData=" + timeLineData + ", sumData=" + sumData + '}';
    }
}
