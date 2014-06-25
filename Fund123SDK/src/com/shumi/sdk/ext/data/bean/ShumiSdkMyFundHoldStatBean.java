package com.shumi.sdk.ext.data.bean;

import com.google.myjson.annotations.SerializedName;

/**
 * 数米持仓收益统计
 * @author John
 *
 */
public class ShumiSdkMyFundHoldStatBean {
	/**
	 * 系统日期
	 */
	@SerializedName("SystemDay")
    public String SystemDay;
    
	/**
	 * 交易日
	 */
	@SerializedName("CurrDay")
	public String CurrDay;
	
	/**
	 * 总持仓数量	
	 */
	@SerializedName("TotalHoldGatherNum")
	public Integer TotalHoldGatherNum;
	
	/**
	 * 已经更新净值数量
	 */
	@SerializedName("HadNetValueHoldGatherNum")
	public Integer HadNetValueHoldGatherNum;
	
	/**
	 * 持仓本金
	 */
	@SerializedName("HoldCost")
	public Double HoldCost;
	
	/**
	 * 市值
	 */
	@SerializedName("CityValue")
	public Double MarketValue;
	
	/**
	 * 今日盈亏
	 */
	@SerializedName("TodayIncome")
	public Double TodayIncome;
	
	/**
	 * 持仓盈亏
	 */
	@SerializedName("HoldIncome")
	public Double HoldIncome;
	
	/**
	 * 持仓盈亏率
	 */
	@SerializedName("HoldIncomeRate")
	public Double HoldIncomeRate;
}
