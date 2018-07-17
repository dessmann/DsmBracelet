package com.dsm.ibracelet.bean;

/**
 * 作者：云渡山<br>
 * 创建时间：2018/7/17 15 13 星期二<br>
 * 功能描述：手环绑定成功的数据，上传到服务器<br>
 */
public class ParamBindSuccess {
    private String passString;
    private String name;
    private String userAccount;
    private String relativedDeviceMac;
    private String braceletMacAddress;

    public String getPassString() {
        return passString;
    }

    public ParamBindSuccess setPassString(String passString) {
        this.passString = passString;
        return this;
    }

    public String getName() {
        return name;
    }

    public ParamBindSuccess setName(String name) {
        this.name = name;
        return this;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public ParamBindSuccess setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    public String getRelativedDeviceMac() {
        return relativedDeviceMac;
    }

    public ParamBindSuccess setRelativedDeviceMac(String relativedDeviceMac) {
        this.relativedDeviceMac = relativedDeviceMac;
        return this;
    }

    public String getBraceletMacAddress() {
        return braceletMacAddress;
    }

    public ParamBindSuccess setBraceletMacAddress(String braceletMacAddress) {
        this.braceletMacAddress = braceletMacAddress;
        return this;
    }

    @Override
    public String toString() {
        return "ParamBindSuccess{" + "passString='" + passString + '\'' + ", name='" + name + '\'' + ", userAccount='" + userAccount + '\'' + ", relativedDeviceMac='" + relativedDeviceMac + '\'' + ", braceletMacAddress='" + braceletMacAddress + '\'' + '}';
    }
}
