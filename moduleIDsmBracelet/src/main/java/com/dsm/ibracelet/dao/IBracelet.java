package com.dsm.ibracelet.dao;

import com.dsm.ibracelet.bean.ParamBind;
import com.dsm.ibracelet.bean.ParamBindSuccess;
import com.dsm.ibracelet.bean.BraceletSport;

import java.util.Date;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/17 14 34 星期二<br>
 * 功能描述：手环api接口<br>
 */
public interface IBracelet {

    //通过app实现锁与手环的绑定，以方便使用手环开锁，BraceletBindSuccess重构成列表的第一个元素
    void bindBracelet(ParamBind paramBind, IBraceletCallBack<ParamBindSuccess> iBraceletCallBack);

    //获取某一天的运动数据
    void getSportData(Date date, IBraceletCallBack<BraceletSport> iBraceletCallBack);
}
