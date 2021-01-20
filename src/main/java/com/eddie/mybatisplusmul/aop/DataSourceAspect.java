package com.eddie.mybatisplusmul.aop;

import com.eddie.mybatisplusmul.annotation.DataSource;
import com.eddie.mybatisplusmul.multiple.DataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:26
 **/

@Component
@Slf4j
@Aspect
@Order(-1)
public class DataSourceAspect {
    @Pointcut("@within(com.eddie.mybatisplusmul.annotation.DataSource) || @annotation(com.eddie.mybatisplusmul.annotation.DataSource)")
    public void pointCut(){

    }

    @Before("pointCut() && @annotation(dataSource)")
    public void doBefore(DataSource dataSource){
        log.info("选择数据源---"+dataSource.value().getValue());
        DataSourceContextHolder.setDataSource(dataSource.value().getValue());
    }

    @After("pointCut()")
    public void doAfter(){
        DataSourceContextHolder.clear();
    }
}
