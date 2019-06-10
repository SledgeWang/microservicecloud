package com.heque.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.heque.dao.ActivityDao;
import com.heque.pojo.VoActivity;
import com.heque.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Resource(name = "activityDao")
	private ActivityDao activityDao;
	
	@Override
	public VoActivity selectByActName(String actName) {
		return activityDao.selectByActName(actName);
	}

}
