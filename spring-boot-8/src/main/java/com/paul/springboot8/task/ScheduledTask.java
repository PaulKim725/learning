package com.paul.springboot8.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 *
 * @author jinzhm
 * @date 2020/12/10 10:41
 */
@Component
public class ScheduledTask {

    /** 
     * 每两秒执行一次
     * <br/>
     *
     
     * @return void
     * @author jinzhm
     * @date 2020/12/10 10:44
     */
    @Scheduled(fixedRate = 2000)
    public void fixedRate() {
        System.out.println("fixedRate-->" + System.currentTimeMillis());
    }

    /** 
     * 上一次执行完成后两秒再执行
     * <br/>
     *
     
     * @return void
     * @author jinzhm
     * @date 2020/12/10 10:45
     */
    @Scheduled(fixedDelay = 2000)
    public void fixedDelay() {
        System.out.println("fixedDelay-->" + System.currentTimeMillis());
    }

    /** 
     * 第一次延迟两秒后执行，之后在上一次执行完成后再执行
     * <br/>
     *
     
     * @return void
     * @author jinzhm
     * @date 2020/12/10 10:45
     */
    @Scheduled(initialDelay = 2000, fixedDelay = 2000)
    public void initialDelay() {
        System.out.println("initialDelay-->" + System.currentTimeMillis());
    }

    /** 
     * 定时执行
     * <br/>
     *
     
     * @return void
     * @author jinzhm
     * @date 2020/12/10 10:55
     */
    @Scheduled(cron = "0/10 * * * * *")
    public void cron(){
        System.out.println("cron-->" + System.currentTimeMillis());
    }

}
