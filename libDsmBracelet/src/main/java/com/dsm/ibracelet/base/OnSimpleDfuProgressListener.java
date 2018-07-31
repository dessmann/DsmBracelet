package com.dsm.ibracelet.base;

/**
 * 作者：德施曼<br>
 * 创建时间：2017/11/6 13:36<br>
 * 功能描述：简单的DFU升级监听器<br>
 */
public interface OnSimpleDfuProgressListener {

    /**
     * 进入固件更新模式成功
     * @param deviceAddress 设备mac地址
     */
    void inputFirewareUpdateMode(String deviceAddress);

    /**
     *  开始更新
     * @param deviceAddress 设备mac地址
     */
    void onDfuProcessStarting(final String deviceAddress);

    /**
     * 更新完成
     * @param deviceAddress 设备mac地址
     */
    void onDfuCompleted(final String deviceAddress);

    /**
     *  正在更新
     * @param deviceAddress 设备mac地址
     * @param percent   当前进度值
     * @param speed     当前更新速度
     * @param avgSpeed  平均更新速度
     * @param currentPart   当前更新的片区索引
     * @param partsTotal    总片区数
     */
    void onProgressChanged(final String deviceAddress, final int percent, final float speed, final float avgSpeed, final int currentPart, final int partsTotal);

    /**
     * 更新失败
     * @param deviceAddress 设备mac地址
     * @param errorCode 错误码
     */
    void onError(final String deviceAddress, final int errorCode);
}
