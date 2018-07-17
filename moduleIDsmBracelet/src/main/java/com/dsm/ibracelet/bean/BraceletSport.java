package com.dsm.ibracelet.bean;

import java.util.List;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/17 14 11 星期二<br>
 * 功能描述：手环的运动数据<br>
 */
public class BraceletSport {
    /*{
        "timeLineData": [//运动时间线数据
            {
                "startMillis":"2018-07-11 19:37:00",//运动的开始时间
                "endMillis":"2018-07-11 22:35:00",//运动的结束时间
                "energy":3.12//消耗的能量，单位：大卡
                "steps":37//如果code表示的运动类型是散步，则为具体步数
                "code":1//具体的运动类型 0 未佩戴手环 1 充电 2 浅睡眠 3 深睡眠 4 清醒 5 静 6 活动 7 散步 8 坐车 9 热身 10 健走 11 跑步 12 运动 13 游泳 14 自行车 15 健身 16 羽毛球
            },
            {
                "startMillis":"2018-07-19 11:36:00",
                "endMillis":"2018-07-19 22:39:00",
                "energy":5.22
                "steps":0
                "code":2
            },
            {
                "startMillis":"2018-07-11 19:37:00",
                "endMillis":"2018-07-11 22:35:00",
                "energy":3.12
                "steps":37
                "code":3
            }
        ],
        "sumData": {//运动基本统计数据
            "distance":209.8,//行走距离
            "steps":300,//行走步数
            "sleepScore":5.2,//睡眠质量，大于4.5为优，大于3小于4.5为良，3以下为一般
            "sleepMinutes":205,//睡眠时长，单位为分钟，最大值为480
            "energyinkcal":103//消耗能量，单位为大卡，最大值200
        }
    }*/
    private List<TimeLine> timeLineData;
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
