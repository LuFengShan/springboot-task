springboot 任务
## 异步任务的使用步骤
1.开启spring的异步任务**@EnableAsync**
```java
@EnableAsync // 开启异步任务
```
2.在方法上面使用**@Async**注解
```java
@Async // 告诉spring这是一个异步的方法
public void asyncOut() {
}
```
## 定时任务的使用步骤
> TaskExecutor 、TaskScheduler接口
1. 开启spring定时任务的注解**@EnableScheduling**
```java
@EnableScheduling // 开启定时任务
```
2. 在方法上面使用**@Scheduled**注解
```java
@Scheduled(cron = "0,10,20 * * * * 0-7") // 开启定时任务
public void scheduledOut() {
    System.out.println("spring定时任务 ： " + LocalDateTime.now());
}
```
3. cron表达式的使用，这个要注意，自己在好好练习一下
```text
cron的表达式默认是使用6个*来表示。* * * * * * ，分别代表秒，分，时，日，月，年 
"0 * * * * MON-SUN" 或者 "0 * * * * 0-7"比嗾使周一到周日，每到0秒的时候开始运行 中间的枚举可以用‘,’分开，
例如"0,10,20 * * * * 0-7"的秒， 
如果是一个区间可以用“-”来连接
```

