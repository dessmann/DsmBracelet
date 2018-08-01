# DsmBracelet
德施曼手环标准接口sdk

## 一.android studio引用
### Step 1. Add the JitPack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
```
### Step 2. Add the dependency
当前最新版本为0.8.3
```
dependencies {
	        implementation 'com.github.dessmann:DsmBracelet:0.8.3'
}
```
## 二.需要实现的接口
需要实现`com.dsm.ibracelet.service.IBracelet`接口，复写该接口的所有方法
```
    /**
     * 接口1：通过app实现锁与手环的绑定，以方便使用手环开锁，ParamBindSuccess重构成列表的第一个元素
     * @param paramBind 绑定手环的参数 参考{@link ParamBind}
     * @param iBraceletCallBack 操作结果回调 {@link IBraceletCallBack} 回调接口 {@link ParamBindSuccess} 绑定成功的数据
     */
    void bindBracelet(ParamBind paramBind, IBraceletCallBack<ParamBindSuccess> iBraceletCallBack);

    /**
     * 接口2：通过app实现锁与手环的解绑
     * @param paramUnBind   解绑手环的参数 参考{@link ParamUnBind}
     * @param iBraceletCallBack 操作结果回调 {@link IBraceletCallBack} 回调接口
     */
    void unBindBracelet(ParamUnBind paramUnBind, IBraceletCallBack iBraceletCallBack);

    /**
     * 接口3：获取某一天的运动数据
     * @param braceletMac 手环的mac地址
     * @param date  某一天的数据
     * @param iBraceletCallBack 操作结果回调 {@link IBraceletCallBack} 回调接口 {@link BraceletSport} 运动数据
     */
    void getSportData(String braceletMac, Date date, IBraceletCallBack<BraceletSport> iBraceletCallBack);

    /**
     * 接口4：恢复出厂设置
     * @param braceletMac 手环的mac地址
     * @param iBraceletCallBack 操作结果回调 {@link IBraceletCallBack} 回调接口
     */
    void resetFactoryWithCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    /**
     * 接口5：时间同步
     * @param braceletMac   手环的mac地址
     * @param iBraceletCallBack 作结果回调 {@link IBraceletCallBack} 回调接口
     */
    void syncTimeWithCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    /**
     * 接口6：获取手环固件版本信息
     * @param braceletMac   手环的mac地址
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口 固件版本信息以字符串形式作为列表的第一个元素返回
     */
    void fetchDeviceVersionWithCallback(String braceletMac, IBraceletCallBack<String> iBraceletCallBack);

    /**
     * 接口7：断开手环连接
     * @param braceletMac 手环的mac地址
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void cancelTaskAndUnlinkWithFinishCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    /**
     * 接口8：检查手环是否已连接
     * @param braceletMac 手环的mac地址
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口 验证结果以布尔形式作为列表的第一个元素返回
     */
    void isConnected(String braceletMac, IBraceletCallBack<Boolean> iBraceletCallBack);

    /**
     * 接口9：使手环振动
     * @param braceletMac 手环的mac地址
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void vibrateWithCallback(String braceletMac, IBraceletCallBack iBraceletCallBack);

    /**
     * 10：获取手环电量
     * @param braceletMac 手环的mac地址
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口 {@link Battery} 电量
     */
    void fetchBatteryWithCallback(String braceletMac, IBraceletCallBack<Battery> iBraceletCallBack);

    /**
     * 11：配置手环屏幕显示方式 是否自动翻页 是否竖屏模式 是否右手模式 是否高亮模式 是否抬腕亮屏
     * @param braceletMac   手环mac地址
     * @param displayConfig 屏幕显示方式的配置数据，参考{@link DisplayConfig}
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void setDisplayStyleWithConfig(String braceletMac, DisplayConfig displayConfig, IBraceletCallBack iBraceletCallBack);

    /**
     * 12：配置消息提醒开关
     * @param braceletMac 手环mac地址
     * @param phoneCall 来电提醒 true 开启 false 关闭
     * @param wechat 微信消息提醒 true 开启 false 关闭
     * @param qq qq消息提醒 true 开启 false 关闭
     * @param sms 短信提醒 true 开启 false 关闭
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void setMsgNotification(String braceletMac, boolean phoneCall, boolean wechat, boolean qq, boolean sms, IBraceletCallBack iBraceletCallBack);

    /**
     * 13：配置屏幕显示内容 showHeartrate 心率表盘 showWeather 天气表盘 showSport 运动表盘
     * @param braceletMac 手环mac地址
     * @param showHeartrate 是否显示心率表盘 true 显示 false 不显示
     * @param showWeather 是否显示天气表盘 true 显示 false 不显示
     * @param showSport 是否显示运动表盘 true 显示 false 不显示
     * @param iBraceletCallback 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void setScreenShowContent(String braceletMac, boolean showHeartrate, boolean showWeather, boolean showSport, IBraceletCallBack iBraceletCallback);

    /**
     * 14：更新手环固件
     * @param braceletMac 手环mac地址
     * @param firewarePath 手环固件文件路径
     * @param onSimpleDfuProgressListener  结果回调 {@link OnSimpleDfuProgressListener} 回调接口
     */
    void updateFireware(String braceletMac, String firewarePath, OnSimpleDfuProgressListener onSimpleDfuProgressListener);

    /**
     * 15：设置当前目标设备
     * @param braceletMac 手环mac地址
     * @param name 手环名称
     * @param bindDate 日期
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void configCurrentDeviceWithMac(String braceletMac, String name, Date bindDate, IBraceletCallBack iBraceletCallBack);

    /**
     * 16：设置久坐提醒
     * @param braceletMac 手环mac地址
     * @param standReminder 久坐提醒数据 参考{@link StandReminder}
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void setStandReminderWithStandReminder(String braceletMac, StandReminder standReminder, IBraceletCallBack iBraceletCallBack);

    /**
     * 17：设置闹钟
     * @param braceletMac 手环mac地址
     * @param alarmClocks 闹钟数据 参考{@link AlarmClock}
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void setAlarmsWithAlarms(String braceletMac, List<AlarmClock> alarmClocks, IBraceletCallBack iBraceletCallBack);

    /**
     * 18：重启手环
     * @param braceletMac 手环mac地址
     * @param iBraceletCallBack 结果回调 {@link IBraceletCallBack} 回调接口
     */
    void restart(String braceletMac, IBraceletCallBack iBraceletCallBack);

    /**
     * 19：启用或禁用调试模式，如果开启调试模式，控制台需要输出log，关闭则不输出
     * @param debug true 开启 false 关闭
     */
    void enableDebug(boolean debug);

    /**
     * 20：判断当前是否是调式模式
     * @return true 调试模式已开启 false 调试模式已关闭
     */
    boolean isDebuging();
```
具体说明请参考docs文件夹中的API说明文档
## 三.其他说明
#### 厂家标识
+ bong 001
+ 乐心 002
#### 设备广播
+ 广播名字格式为 dsm-bl-[厂家标识]-[手环mac地址后四位], bl解释为bracelet的简写
+ 比如某个乐心手环的mac地址为DB:E5:F5:0D:86:69,则广播的名字为dsm-bl-002-8669
