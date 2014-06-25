package com.shumi.sdk.ext.data.bean;

import java.util.List;

import com.google.myjson.annotations.SerializedName;

/**
 * 数米基金真实账本持仓明细
 * 
 * @author John
 * 
 */
@SuppressWarnings("serial")
public class ShumiSdkMyFundHoldGathersBean extends ShumiSdkTradeBaseBean {
	public static class Item extends ShumiSdkTradeBaseBean {
		/**
		 * 基金名称
		 */
		@SerializedName("FundName")
		public String FundName;

		/**
		 * 基金代码
		 */
		@SerializedName("FundCode")
		public String FundCode;

		/**
		 * 市值
		 */
		@SerializedName("CityValue")
		public Double CityValue;

		/**
		 * 持仓本金
		 */
		@SerializedName("HoldCost")
		public Double HoldCost;

		/**
		 * 已赎回金额
		 */
		@SerializedName("HadRedeemValue")
		public Double HadRedeemValue;

		/**
		 * 总收益
		 */
		@SerializedName("TotalIncome")
		public Double TotalIncome;

		/**
		 * 持有份额
		 */
		@SerializedName("HoldQuotient")
		public Double HoldQuotient;

		/**
		 * 持仓盈亏率
		 */
		@SerializedName("HoldIncomeRate")
		public Double HoldIncomeRate;

		/**
		 * 当前交易日
		 */
		@SerializedName("CurrDate")
		public String CurrDate;

		/**
		 * 净值日期
		 */
		@SerializedName("NetValueDate")
		public String NetValueDate;

		/**
		 * 系统日期
		 */
		@SerializedName("SystemDate")
		public String SystemDate;

		/**
		 * 净值(货币基金为万份收益)
		 */
		@SerializedName("NetValue")
		public Double NetValue;

		/**
		 * 基金类型
		 */
		@SerializedName("FundType")
		public Integer FundType;

		/**
		 * 增长率(货币基金为七日年化收益率)
		 */
		@SerializedName("NetValueParcent")
		public Double NetValuePercent;

		/**
		 * 已赎回份额
		 */
		@SerializedName("HadRedeemQuotient")
		public Double HadRedeemQuotient;

		/**
		 * 是否已出净值
		 */
		@SerializedName("IfHadCurrNetValue")
		public Boolean IfHadCurrNetValue;
	}
	
	@SerializedName("datatable")
	private List<Item> Items;
}
