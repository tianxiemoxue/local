package com.shumi.sdk.ext.data.bean;

import java.util.List;

import com.google.myjson.annotations.SerializedName;
import com.shumi.sdk.ext.util.ShumiSdkFundTradingDictionary;

/**
 * 交易申请记录
 * 
 * @author John
 * 
 */
@SuppressWarnings("serial")
public class ShumiSdkTradeApplyRecordsBean extends ShumiSdkTradeBaseBean {
	public static class Item extends ShumiSdkTradeBaseBean {
		/**
		 * 基金代码
		 */
		@SerializedName("FundCode")
		public String FundCode;
		/**
		 * 基金名称
		 */
		@SerializedName("FundName")
		public String FundName;
		/**
		 * 银行编号
		 */
		@SerializedName("BankSerial")
		public String BankSerial;

		/**
		 * 银行名称
		 */
		@SerializedName("BankName")
		public String BankName;

		/**
		 * 银行卡号
		 */
		@SerializedName("BankAccount")
		public String BankAccount;

		/**
		 * 交易帐号<br>
		 */
		@SerializedName("TradeAccount")
		public String TradeAccount;
		/**
		 * 份额类别 见字典帮助类，查询
		 * {@link ShumiSdkFundTradingDictionary.Dictionary#ShareType}
		 */
		@SerializedName("ShareType")
		public String ShareType;
		/**
		 * 申请时间<br>
		 * 输出为 C# DateTime.ToString()<br>
		 * java使用DateFormat格式 yyyy-MM-dd'T'HH:mm:ss
		 */
		@SerializedName("ApplyDateTime")
		public String ApplyDateTime;
		/**
		 * 业务类型 见字典帮助类，查询
		 * {@link ShumiSdkFundTradingDictionary.Dictionary#BusinFlag}
		 */
		@SerializedName("BusinessType")
		public String BusinessType;
		/**
		 * 申请金额
		 */
		@SerializedName("Amount")
		public Double Amount;
		/**
		 * 申请份额
		 */
		@SerializedName("Shares")
		public Double Shares;
		/**
		 * 确认状态<br>
		 * 见字典帮助类，查询
		 * {@link ShumiSdkFundTradingDictionary.Dictionary#ConfirmState}
		 */
		@SerializedName("Status")
		public Integer Status;
		/**
		 * 申请流水号
		 */
		@SerializedName("ApplySerial")
		public String ApplySerial;
		/**
		 * 是否可撤单
		 */
		@SerializedName("CanCancel")
		public Boolean CanCancel;
		/**
		 * 支付结果 扣款状态<br>
		 * 见字典帮助类，查询{@link ShumiSdkFundTradingDictionary.Dictionary#PayResult}
		 */
		@SerializedName("PayResult")
		public Integer PayResult;
		
		/**
		 * 手续费
		 */
		@SerializedName("PoundAge")
		public Double PoundAge;
	}

	/**
	 * 总记录条数
	 */
	@SerializedName("Total")
	public Integer Total;

	/**
	 * 具体记录
	 */
	@SerializedName("Items")
	public List<Item> Items;

}
