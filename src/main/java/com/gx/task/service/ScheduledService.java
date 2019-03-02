package com.gx.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

@Service
public class ScheduledService {

	/**
	 * cron的表达式默认是使用6个*来表示。* * * * * * ，分别代表秒，分，时，日，月，年
	 * "0 * * * * MON-SUN" 或者 "0 * * * * 0-7"比嗾使周一到周日，每到0秒的时候开始运行
	 * 中间的枚举可以用‘,’分开，例如"0,10,20 * * * * 0-7"的秒，
	 * 如果是一个区间可以用“-”来连接
	 */
	@Scheduled(cron = "0,10,20 * * * * 0-7") // 开启定时任务
	public void scheduledOut() {
		System.out.println("spring定时任务 ： " + LocalDateTime.now());
	}

}