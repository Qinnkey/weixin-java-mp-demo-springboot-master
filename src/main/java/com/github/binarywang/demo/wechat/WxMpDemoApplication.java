package com.github.binarywang.demo.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@MapperScan(basePackages = "com.github.binarywang.demo.wechat.mapper")
@SpringBootApplication
public class WxMpDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(WxMpDemoApplication.class, args);
  }
}
