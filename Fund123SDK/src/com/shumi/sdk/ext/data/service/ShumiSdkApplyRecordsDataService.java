package com.shumi.sdk.ext.data.service;

import android.content.Context;

import com.fund123.sdk.delegator.Fund123OauthInterface;
import com.shumi.sdk.IShumiSdkDataBridge;
import com.shumi.sdk.annotation.ShumiSdkDataContentTag;
import com.shumi.sdk.annotation.ShumiSdkOpenApiDataRequestTag;
import com.shumi.sdk.data.service.openapi.ShumiSdkOpenApiDataService;
import com.shumi.sdk.ext.data.bean.ShumiSdkTradeApplyRecordsBean;

/**
 * 用户级dataService demo<br>
 * 获得单个基金的交易记录<br>
 * 请求成功返回类型dataObject为ShumiSdkTradeApplyRecordsBean<br>
 * 首先继承ShumiSdkOpenApiDataService，设置好认证级别(userLevel=true)<br>
 * https://trade.fund123.cn/openapi/help/trade_foundation/
 * getapplyrecordsbyfundcode<br>
 * 请求参数：<li>startTime</li><li>endTime</li><li>pageIndex</li><li>pageSize</li>
 * 
 * @author John
 * 
 */
@ShumiSdkOpenApiDataRequestTag(uri = "/trade_foundation.getapplyrecords", bean = ShumiSdkTradeApplyRecordsBean.class)
public class ShumiSdkApplyRecordsDataService extends ShumiSdkOpenApiDataService {
	public ShumiSdkApplyRecordsDataService(Context context,
			Fund123OauthInterface bridge) {
		super(context, bridge);
	}

	public ShumiSdkApplyRecordsDataService(Context context,
			IShumiSdkDataBridge bridge) {
		super(context, bridge);
	}

	/**
	 * 请求参数<br>
	 * 按照openapi help中自定义参数，并做{@link ShumiSdkDataContentTag}的标注
	 * 参数必须使用可用类型(当值为null时跳过处理)
	 * 
	 * @author John
	 * 
	 */
	public static class Param {
		/**
		 * 起始时间
		 */
		@ShumiSdkDataContentTag("startTime")
		public String StartTime = "0001-01-01";
		/**
		 * 结束时间
		 */
		@ShumiSdkDataContentTag("endTime")
		public String EndTime = "9999-01-01";
		/**
		 * 页码
		 */
		@ShumiSdkDataContentTag("pageIndex")
		public Integer PageIndex = 1;
		/**
		 * 分页条数
		 */
		@ShumiSdkDataContentTag("pageSize")
		public Integer PageSize = 30;
	}
	
	public ShumiSdkTradeApplyRecordsBean getData(Object obj) {
		return cast(obj, ShumiSdkTradeApplyRecordsBean.class);
	}
}
