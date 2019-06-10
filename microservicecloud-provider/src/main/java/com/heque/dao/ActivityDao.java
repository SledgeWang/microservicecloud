package com.heque.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.heque.pojo.VoActivity;

@Mapper
public interface ActivityDao {

	VoActivity selectByPrimaryKey(Integer id);

	VoActivity selectByActName(@Param("actName") String actName);
}