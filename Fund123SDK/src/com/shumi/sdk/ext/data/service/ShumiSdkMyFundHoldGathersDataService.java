package com.shumi.sdk.ext.data.service;

import android.content.Context;

import com.fund123.sdk.delegator.Fund123OauthInterface;
import com.shumi.sdk.IShumiSdkDataBridge;
import com.shumi.sdk.ShumiSdkConstant;
import com.shumi.sdk.annotation.ShumiSdkDataContentTag;
import com.shumi.sdk.annotation.ShumiSdkOpenApiDataRequestTag;
import com.shumi.sdk.data.service.openapi.ShumiSdkOpenApiDataService;
import com.shumi.sdk.ext.data.bean.ShumiSdkMyFundHoldGathersBean;
import com.shumi.sdk.ext.data.bean.ShumiSdkTradeTakeLimitBean;

/**
 * 我的基金真实账本 - 持仓明细 
 * @author John
 * 
 */
@ShumiSdkOpenApiDataRequestTag(uri = "/myfund.getholdgathers", bean = ShumiSdkMyFundHoldGathersBean.class, isArrayBean = true)
public class ShumiSdkMyFundHoldGathersDataService extends
		ShumiSdkOpenApiDataService {
	
	public static class Param {
		@ShumiSdkDataContentTag("accountBookId")
		public String AccountBookId = ShumiSdkConstant.REAL_PARTITION; 
	}
	
	public ShumiSdkMyFundHoldGathersDataService(Context context,
			Fund123OauthInterface bridge) {
		super(context, bridge);
	}

	public ShumiSdkMyFundHoldGathersDataService(Context context,
			IShumiSdkDataBridge bridge) {
		super(context, bridge);
	}
	
	public ShumiSdkMyFundHoldGathersBean getData(Object obj) {
		return cast(obj, ShumiSdkMyFundHoldGathersBean.class);
	}
}
