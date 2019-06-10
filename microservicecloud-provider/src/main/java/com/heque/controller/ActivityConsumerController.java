package com.heque.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heque.pojo.VoActivity;
import com.heque.service.ActivityService;

@RequestMapping("/consumer")
@RestController
public class ActivityConsumerController {

	@Resource
	ActivityService activityService ;
	@Autowired
	DiscoveryClient discoveryClient;
	
	/***
	 * @Title: ActivityController 
	 * @Description: 通过活动名称获取活动详情 
	 * @author TimBrian 
	 * @since 2018年7月26日上午11:40:49 
	 * @param actName 
	 * @return
	 */
	@RequestMapping(value = "/selectByActName/{actName}", method = RequestMethod.GET)
	public VoActivity selectByActName(@PathVariable("actName") String actName) {
		
		return activityService.selectByActName(actName);
	}
	
	@RequestMapping(value = "/discover", method = RequestMethod.GET)
	public Object getDiscoverClientInfo() {
		List<String> services = discoveryClient.getServices();
		System.out.println("services*****************" + services);
		List<ServiceInstance> instances = discoveryClient.getInstances("microservicecloud-provider");
		
		for (ServiceInstance instance : instances) {
			System.out.println(instance.getHost() + instance.getMetadata() + instance.getPort() + instance.getServiceId() + instance.getUri());
		}
		return this.discoveryClient;
	}
}
