package com.x.manage;


import com.x.core.launch.XApplication;
import com.x.manage.common.constant.BaseConstant;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: weihuijie
 * @date: 2020/12/14
 * @description: 启动器
 *  /@SpringBootApplication :标志为 springboot 项目
 *  /@MapperScan("com.x") mybatis-plus 扫描 mapper 文件夹
 */
@SpringBootApplication
@MapperScan("com.x")
public class Application {
    public static void main(String[] args) {
        XApplication.run(BaseConstant.APP_NAME,Application.class,args);
    }
}
