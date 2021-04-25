package com.example.easy.job.server.scheduler;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @className: com.example.easy.job.server.Scheduler-> JobSpringScheduler
 * @description: springboot完成配置加载后，启动线程调度
 * @author: liming.li
 * @createDate: 2021-04-24 下午11:57
 * @todo:
 */

@Data
@Component
public class JobSpringScheduler implements ApplicationContextAware, InitializingBean, DisposableBean {
    private static ApplicationContext applicationContext;

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBoot to destroy!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBoot to start!!!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        JobSpringScheduler.applicationContext = applicationContext;
    }
}
