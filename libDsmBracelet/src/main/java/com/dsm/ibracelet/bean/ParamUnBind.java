package com.dsm.ibracelet.bean;

import java.util.Arrays;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/30 10 59 星期一<br>
 * 功能描述：解除手环绑定的数据<br>
 */
public class ParamUnBind {
    private String braceletMacAddress;//手环的mac地址
    private byte[] passData;//要删除的开门秘钥
    private String relationDeviceMac;//手环关联设备的mac地址

    public String getBraceletMacAddress() {
        return braceletMacAddress;
    }

    public ParamUnBind setBraceletMacAddress(String braceletMacAddress) {
        this.braceletMacAddress = braceletMacAddress;
        return this;
    }

    public byte[] getPassData() {
        return passData;
    }

    public ParamUnBind setPassData(byte[] passData) {
        this.passData = passData;
        return this;
    }

    public String getRelationDeviceMac() {
        return relationDeviceMac;
    }

    public ParamUnBind setRelationDeviceMac(String relationDeviceMac) {
        this.relationDeviceMac = relationDeviceMac;
        return this;
    }

    @Override
    public String toString() {
        return "ParamUnBind{" + "braceletMacAddress='" + braceletMacAddress + '\'' + ", passData=" + Arrays.toString(passData) + ", relationDeviceMac='" + relationDeviceMac + '\'' + '}';
    }
}
