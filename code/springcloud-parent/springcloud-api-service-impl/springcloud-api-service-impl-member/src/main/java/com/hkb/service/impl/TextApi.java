package com.hkb.service.impl;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.order.PopOrderSearchRequest;
import com.jd.open.api.sdk.request.seller.VenderShopQueryRequest;
import com.jd.open.api.sdk.response.order.PopOrderSearchResponse;
import com.jd.open.api.sdk.response.seller.VenderShopQueryResponse;

public class TextApi {
	
	private static final String SERVER_URL = "https://api.jd.com/routerjson";
	private static final String appKey = "AF9DEF5B9DCDD5F2515F5D2C91838B7F";
	private static String appSecret = "056df708457f4de795b5bf94fd7cdbe5";
	private static String accessToken = "a763fb1917634bf199a4fac2f4c78f08zimt";

	public static void main(String[] args) throws Exception {
		JdClient client=new DefaultJdClient(SERVER_URL,accessToken,appKey,appSecret); 
	        PopOrderSearchRequest request=new PopOrderSearchRequest();
	        request.setStartDate("2018-11-14 10:00:00");
	        request.setEndDate("2018-11-22 12:00:00");
	        request.setOrderState("TRADE_CANCELED");
	        request.setOptionalFields("itemInfoList,orderId,isShipmenttype,scDT,idSopShipmenttype,orderStartTime");
	        request.setPage("1");
	        request.setPageSize("20");
	        request.setSortType(1);
	        request.setDateType(0);
	        PopOrderSearchResponse response=client.execute(request);
	        System.out.println(response.getSearchorderinfoResult());
	}
}
