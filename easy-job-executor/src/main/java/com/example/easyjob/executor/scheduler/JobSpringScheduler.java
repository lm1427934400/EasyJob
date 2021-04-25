package com.example.easyjob.executor.scheduler;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @className: com.example.easyjob.executor.scheduler-> JobSpringScheduler
 * @description: 定义调度系统
 * @author: liming.li
 *createDate: 2021-04-25 上午12:30
 * @todo:
 */
@Data
@Component
public class JobSpringScheduler implements ApplicationContextAware, InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBoot to destroy !!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBoot to start !!!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
