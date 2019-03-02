package com.gx.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import sun.plugin2.util.SystemUtil;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

@Service
public class AsyncService {

	@Async // 告诉spring这是一个异步的方法
	public void asyncOut() {
		try {
			String call = new TestThread().call();
			System.out.println(call);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class TestThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(3000L);
		return LocalDateTime.now().toString();
	}
}