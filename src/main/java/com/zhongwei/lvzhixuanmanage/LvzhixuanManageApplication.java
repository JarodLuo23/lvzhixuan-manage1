package com.zhongwei.lvzhixuanmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhongwei.lvzhixuanmanage.mapper")
public class LvzhixuanManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvzhixuanManageApplication.class, args);
    }

}
