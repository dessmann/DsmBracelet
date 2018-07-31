package com.dsm.ibracelet.base;

import java.util.List;

/**
 * 作者：德施曼<br>
 * 创建时间：2018/7/17 14 30 星期二<br>
 * 功能描述：手环通用回调接口<br>
 */
public interface IBraceletCallBack<T> {
    /**
     * 手环操作执行成功的回调
     * @param data 回调数据 T可能是字符串、布尔、自定义引用类型等，请根据使用场景自适配
     */
    void onSuccess(List<T> data);

    /**
     * 手环操作执行失败的回调
     * @param errorCode 具体错误码
     * @param error 具体错误信息
     */
    void onFail(int errorCode, String error);
}
