package com.hrbust.order.core.Starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: birds-order
 * Comments:
 * Author:cbam
 * Create Date:2017/3/24
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
@org.springframework.context.annotation.ComponentScan(basePackages = {"com.hrbust.**.controller", "com.hrbust.**.service", "com.hrbust.**.config", "com.hrbust.**.mapper", "com.hrbust.**.action", "com.hearglobal.**.remote", "com.**"})
@SpringBootApplication
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}
