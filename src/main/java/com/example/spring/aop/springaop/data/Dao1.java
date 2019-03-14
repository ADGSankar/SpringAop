package com.example.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.example.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {

		@TrackTime
		public String retrieveSomething()
		{
			return "Dao1";
		}
	
}
