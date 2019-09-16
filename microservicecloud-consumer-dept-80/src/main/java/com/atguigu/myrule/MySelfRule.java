package com.atguigu.myrule;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule(){
//		return new RoundRobinRule();// 达到目的，用我们重新选择的随机算法替代默认的轮询
//		return new RandomRule();
		return new RandomRule_DSH();
	}
}
