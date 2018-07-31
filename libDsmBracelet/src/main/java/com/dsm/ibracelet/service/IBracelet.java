package com.dsm.ibracelet.service;

import com.dsm.ibracelet.base.IBraceletCallBack;
import com.dsm.ibracelet.base.OnSimpleDfuProgressListener;
import com.dsm.ibracelet.bean.AlarmClock;
import com.dsm.ibracelet.bean.Battery;
import com.dsm.ibracelet.bean.BraceletSport;
import com.dsm.ibracelet.bean.DisplayConfig;
import com.dsm.ibracelet.bean.ParamBind;
import com.dsm.ibracelet.bean.ParamBindSuccess;
import com.dsm.ibracelet.bean.ParamUnBind;
import com.dsm.ibracelet.bean.StandReminder;

import java.util.Date;
import java.util.List;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/17 14 34 星期二<br>
 * 功能描述：手环api接口<br>
 */
public interface IBracelet {
    //通过app实现锁与手环的绑定，以方便使用手环开锁，ParamBindSuccess重构成列表的第一个元素
    void bindBracelet(ParamBind paramBind, IBraceletCallBack<ParamBindSuccess> iBraceletCallBack);

    //通过app实现锁与手环的解绑
    void unBindBracelet(ParamUnBind paramUnBind, IBraceletCallBack iBraceletCallBack);

    //获取某一天的运动数据
    void getSportData(String braceletMac, Date date, IBraceletCallBack<BraceletSport> iBraceletCallBack);

    //恢复出厂设置
    void resetFactoryWithCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    //时间同步
    void syncTimeWithCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    //获取手环固件版本信息
    void fetchDeviceVersionWithCallback(String braceletMac, IBraceletCallBack<String> iBraceletCallBack);

    //断开手环连接
    void cancelTaskAndUnlinkWithFinishCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    //手环是否已连接
    void isConnected(String braceletMac, IBraceletCallBack iBraceletCallBack);

    //使手环振动
    void vibrateWithCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    //获取手环电量
    void fetchBatteryWithCallback(String braceletMac, IBraceletCallBack<Battery> iBraceletCallBack);

    //配置手环屏幕显示方式 是否自动翻页 是否竖屏模式 是否右手模式 是否高亮模式 是否抬腕亮屏
    void setDisplayStyleWithConfig(String braceletMac, DisplayConfig displayConfig, IBraceletCallBack iBraceletCallBack);

    //配置消息提醒开关
    void setMsgNotification(String braceletMac, boolean phoneCall, boolean wechat, boolean qq, boolean sms, IBraceletCallBack iBraceletCallBack);

    //配置屏幕显示内容 showHeartrate 心率表盘 showWeather 天气表盘 showSport 运动表盘
    void setScreenShowContent(String braceletMac, boolean showHeartrate, boolean showWeather, boolean showSport, IBraceletCallBack iBraceletCallback);

    //更新手环固件
    void updateFireware(String braceletMac, String firewarePath, OnSimpleDfuProgressListener onSimpleDfuProgressListener);

    //设置当前目标设备
    void configCurrentDeviceWithMac(String braceletMac, String name, Date bindDate, IBraceletCallBack iBraceletCallBack);

    //设置久坐提醒
    void setStandReminderWithStandReminder(String braceletMac, StandReminder standReminder, IBraceletCallBack iBraceletCallBack);

    //设置闹钟
    void setAlarmsWithAlarms(String braceletMac, List<AlarmClock> alarmClocks, IBraceletCallBack iBraceletCallBack);

    //重启手环
    void restart(String braceletMac, IBraceletCallBack iBraceletCallBack);

    //启用或禁用调试模式，如果开启调试模式，控制台需要输出log，关闭则不输出
    void enableDebug(boolean debug);

    //判断当前是否是调式模式
    boolean isDebuging();

}
