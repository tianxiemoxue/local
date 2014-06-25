package com.shumi.sdk.ext.data.service;

import java.lang.reflect.Type;
import java.util.List;

import org.json.JSONObject;

import android.content.Context;

import com.fund123.sdk.delegator.Fund123OauthInterface;
import com.google.myjson.Gson;
import com.google.myjson.reflect.TypeToken;
import com.shumi.sdk.IShumiSdkDataBridge;
import com.shumi.sdk.annotation.ShumiSdkOpenApiDataRequestTag;
import com.shumi.sdk.data.service.openapi.ShumiSdkOpenApiDataService;
import com.shumi.sdk.ext.data.bean.ShumiSdkTradeBindedBankCardBean;
import com.shumi.sdk.ext.data.bean.ShumiSdkTradeFundSharesBean;

/**
 * 查询持仓请求
 * 返回DataObject: List&ltShumiSdkTradeFundSharesBean&gt
 * @author John
 *
 */
@SuppressWarnings("deprecation")
@ShumiSdkOpenApiDataRequestTag(uri = "", bean = ShumiSdkTradeFundSharesBean.class, isArrayBean = true)
public class ShumiSdkGetFundSharesDataService extends ShumiSdkOpenApiDataService {
	
	public ShumiSdkGetFundSharesDataService(Context context,
			Fund123OauthInterface bridge, boolean isMonetaryOnly) {
		super(context, bridge);
		this.isMonetaryOnly = isMonetaryOnly;
	}
	
	public ShumiSdkGetFundSharesDataService(Context context,
			IShumiSdkDataBridge bridge, boolean isMonetaryOnly) {
		super(context, bridge);
		this.isMonetaryOnly = isMonetaryOnly;
	}

	// 所有基金持仓
	private static final String TagGetFundShares = "/trade_foundation.getfundshares";
	// 货币基金持仓
	private static final String TagGetFundSharesByMonetary = "/trade_foundation.getfundsharesbymonetary";
	// 是否是货币基金
	private boolean isMonetaryOnly = true;	
	
	@Override
	protected String getResouceURI() {
		return isMonetaryOnly ? TagGetFundSharesByMonetary : TagGetFundShares;
	}
	
	public ShumiSdkTradeFundSharesBean getData(Object obj) {
		return cast(obj, ShumiSdkTradeFundSharesBean.class);
	}
}
