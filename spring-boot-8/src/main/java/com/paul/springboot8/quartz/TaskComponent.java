package com.paul.springboot8.quartz;

import org.springframework.stereotype.Component;

/**
 * 任务
 *
 * @author jinzhm
 * @date 2020/12/10 11:14
 */
@Component
public class TaskComponent {

    public void runTask(){
        System.out.println("task component run-->" + System.currentTimeMillis());
    }
}
