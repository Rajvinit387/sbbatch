package com.example.springbootbatch1.config;
 


import org.springframework.batch.item.ItemProcessor;

import com.example.springbootbatch1.model.*;

public class userItemprocessor implements ItemProcessor<user, user> {

	@Override
	public user process(user user) throws Exception {
		// TODO Auto-generated method stub
		return user;
	}

}

