package com.eddie.mybatisplusmul.annotation;

import com.eddie.mybatisplusmul.enums.DataSourceEnum;
import org.springframework.context.annotation.Bean;

import java.lang.annotation.*;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:23
 **/

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    
    DataSourceEnum value() default DataSourceEnum.DB1;

}
