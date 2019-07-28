package com.wind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description:  
 * Copyright (c) Department of Research and Development/Beijing
 * All Rights Reserved.
 *
 * @author zhangzhentao
 * @version 1.0  2019/7/12 8:34 AM  by 张振涛 创建
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.wind.system.mapper")
public class WindPlatFormApplication {

        public static void main(String[] args)
        {
            SpringApplication.run(WindPlatFormApplication.class, args);
            System.out.println("*********启动成功*************");
        }

}
