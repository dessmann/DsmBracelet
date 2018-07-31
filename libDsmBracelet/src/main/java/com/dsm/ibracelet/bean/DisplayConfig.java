package com.dsm.ibracelet.bean;

/**
 * 作者：德施曼<br>
 * 创建时间：2018/7/30 13 20 星期一<br>
 * 功能描述：屏幕显示方式<br>
 */
public class DisplayConfig {
    /**
     * 自动翻页 true 开启 false 关闭
     */
    private boolean autoFlip;
    /**
     * 竖屏模式 true 开启 false 关闭
     */
    private boolean verticalMode;
    /**
     * 右手模式 true 开启 false 关闭
     */
    private boolean rightHand;
    /**
     * 高亮模式 true 开启 false 关闭
     */
    private boolean highlight;
    /**
     * 抬腕亮屏 true 开启 false 关闭
     */
    private boolean liftup;

    public boolean isAutoFlip() {
        return autoFlip;
    }

    public DisplayConfig setAutoFlip(boolean autoFlip) {
        this.autoFlip = autoFlip;
        return this;
    }

    public boolean isVerticalMode() {
        return verticalMode;
    }

    public DisplayConfig setVerticalMode(boolean verticalMode) {
        this.verticalMode = verticalMode;
        return this;
    }

    public boolean isRightHand() {
        return rightHand;
    }

    public DisplayConfig setRightHand(boolean rightHand) {
        this.rightHand = rightHand;
        return this;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public DisplayConfig setHighlight(boolean highlight) {
        this.highlight = highlight;
        return this;
    }

    public boolean isLiftup() {
        return liftup;
    }

    public DisplayConfig setLiftup(boolean liftup) {
        this.liftup = liftup;
        return this;
    }

    @Override
    public String toString() {
        return "DisplayConfig{" + "autoFlip=" + autoFlip + ", verticalMode=" + verticalMode + ", rightHand=" + rightHand + ", highlight=" + highlight + ", liftup=" + liftup + '}';
    }
}
