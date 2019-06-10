package com.heque.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.heque.pojo.VoActivity;

@RestController
@RequestMapping("activity")
public class ActivityController {

	//private static final String REST_URL_PREFIX = "http://192.168.10.72:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-PROVIDER";
	
	@Resource
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumer/selectByActName/{actName}")
	public VoActivity getSelectByActName(@PathVariable("actName") String actName) {
		System.out.println(111);
		return restTemplate.getForObject(REST_URL_PREFIX + "/consumer/selectByActName/" + actName, VoActivity.class);
	}
	
	/**
	 * @Title: ActivityController   
	 * @Description: 通过consumer调用服务端(provider)
	 * @author TimBrian
	 * @since Dec 7, 201812:11:31 PM   
	 * @return
	 */
	@RequestMapping(value = "/discovery")
	public Object getDiscovery() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/consumer/discover", Object.class);
	}
	
}
