package com.dsm.ibracelet.base;

import java.util.List;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/17 14 30 星期二<br>
 * 功能描述：手环回调接口<br>
 */
public interface IBraceletCallBack<T> {
    void onSuccess(List<T> data);
    void onFail(int errorCode, String error);
}
