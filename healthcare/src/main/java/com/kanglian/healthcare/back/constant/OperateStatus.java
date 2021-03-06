package com.kanglian.healthcare.back.constant;

/**
 * 操作状态
 * 
 * @author xl.liu
 */
public final class OperateStatus {
    // 未发货
    public static final String TRADE_GOODS_UNSEND     = "0";
    // 已发货
    public static final String TRADE_GOODS_SEND       = "1";

    // 状态：1，进行中；2，已结束
    public static final String STRING_STATUS_CONTINUE = "1";
    public static final String STRING_STATUS_FINISH   = "2";

    // 退款
    public static final String MARK_MONEY_REFUND      = "0";
    // 支付
    public static final String MARK_MONEY_PAY         = "1";
    // 收入
    public static final String MARK_MONEY_INCOME      = "2";

}
