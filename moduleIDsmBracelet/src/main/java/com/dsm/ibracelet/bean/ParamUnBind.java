package com.dsm.ibracelet.bean;

import java.util.Arrays;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/30 10 59 星期一<br>
 * 功能描述：解除手环绑定的数据<br>
 */
public class ParamUnBind {
    private String bongMacAddress;//Bong的mac地址
    private byte[] bongPass;//要删除的Bong的开门秘钥
    private String relationDeviceMac;//手环关联设备的mac地址

    public String getBongMacAddress() {
        return bongMacAddress;
    }

    public ParamUnBind setBongMacAddress(String bongMacAddress) {
        this.bongMacAddress = bongMacAddress;
        return this;
    }

    public byte[] getBongPass() {
        return bongPass;
    }

    public ParamUnBind setBongPass(byte[] bongPass) {
        this.bongPass = bongPass;
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
        return "ParamUnBind{" + "bongMacAddress='" + bongMacAddress + '\'' + ", bongPass=" + Arrays.toString(bongPass) + ", relationDeviceMac='" + relationDeviceMac + '\'' + '}';
    }
}
