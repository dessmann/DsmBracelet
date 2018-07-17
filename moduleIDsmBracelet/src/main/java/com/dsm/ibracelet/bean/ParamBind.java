package com.dsm.ibracelet.bean;

import java.util.Arrays;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/17 15 11 星期二<br>
 * 功能描述：绑定手环的数据<br>
 */
public class ParamBind {
    private String Name;//手环名称，蓝牙扫描出来的名称
    private String userAccount;//添加手环的用户账号
    private String braceletMacAddress;//手环mac地址
    private byte[] opensecretkey;//开门秘钥
    private String relativedDeviceMac;//关联设备mac地址
    private String relativedDeviceChannelPwd;//关联设备信道密码

    public String getName() {
        return Name;
    }

    public ParamBind setName(String name) {
        Name = name;
        return this;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public ParamBind setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    public String getBraceletMacAddress() {
        return braceletMacAddress;
    }

    public ParamBind setBraceletMacAddress(String braceletMacAddress) {
        this.braceletMacAddress = braceletMacAddress;
        return this;
    }

    public byte[] getOpensecretkey() {
        return opensecretkey;
    }

    public ParamBind setOpensecretkey(byte[] opensecretkey) {
        this.opensecretkey = opensecretkey;
        return this;
    }

    public String getRelativedDeviceMac() {
        return relativedDeviceMac;
    }

    public ParamBind setRelativedDeviceMac(String relativedDeviceMac) {
        this.relativedDeviceMac = relativedDeviceMac;
        return this;
    }

    public String getRelativedDeviceChannelPwd() {
        return relativedDeviceChannelPwd;
    }

    public ParamBind setRelativedDeviceChannelPwd(String relativedDeviceChannelPwd) {
        this.relativedDeviceChannelPwd = relativedDeviceChannelPwd;
        return this;
    }

    @Override
    public String toString() {
        return "ParamBind{" + "Name='" + Name + '\'' + ", userAccount='" + userAccount + '\'' + ", braceletMacAddress='" + braceletMacAddress + '\'' + ", opensecretkey=" + Arrays.toString(opensecretkey) + ", relativedDeviceMac='" + relativedDeviceMac + '\'' + ", relativedDeviceChannelPwd='" + relativedDeviceChannelPwd + '\'' + '}';
    }
}
