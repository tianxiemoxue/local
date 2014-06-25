package com.shumi.sdk.ext.data.service;

import android.content.Context;

import com.fund123.sdk.delegator.Fund123OauthInterface;
import com.shumi.sdk.IShumiSdkDataBridge;
import com.shumi.sdk.ShumiSdkConstant;
import com.shumi.sdk.annotation.ShumiSdkDataContentTag;
import com.shumi.sdk.annotation.ShumiSdkOpenApiDataRequestTag;
import com.shumi.sdk.data.service.openapi.ShumiSdkOpenApiDataService;
import com.shumi.sdk.ext.data.bean.ShumiSdkMyFundHoldGathersBean;
import com.shumi.sdk.ext.data.bean.ShumiSdkMyFundHoldStatBean;
import com.shumi.sdk.ext.data.bean.ShumiSdkTradeTakeLimitBean;

/**
 * 我的基金真实账本 - 收益統計
 * 
 * @author John
 * 
 */
@ShumiSdkOpenApiDataRequestTag(uri = "/myfund.getholdstat", bean = ShumiSdkMyFundHoldStatBean.class)
public class ShumiSdkMyFundHoldStatDataService extends
		ShumiSdkOpenApiDataService {
	
	public static class Param {
		@ShumiSdkDataContentTag("accountBookId")
		public String AccountBookId = ShumiSdkConstant.REAL_PARTITION; 
	}
	
	public ShumiSdkMyFundHoldStatDataService(Context context,
			Fund123OauthInterface bridge) {
		super(context, bridge);
	}

	public ShumiSdkMyFundHoldStatDataService(Context context,
			IShumiSdkDataBridge bridge) {
		super(context, bridge);
	}
	
	public ShumiSdkMyFundHoldStatBean getData(Object obj) {
		return cast(obj, ShumiSdkMyFundHoldStatBean.class);
	}
}
