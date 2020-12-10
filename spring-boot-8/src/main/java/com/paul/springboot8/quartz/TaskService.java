package com.paul.springboot8.quartz;

import org.springframework.stereotype.Service;

/**
 * 任务
 *
 * @author jinzhm
 * @date 2020/12/10 11:06
 */
public class TaskService {

    public void runTask(){
        System.out.println("task service run-->" + System.currentTimeMillis());
    }
}
