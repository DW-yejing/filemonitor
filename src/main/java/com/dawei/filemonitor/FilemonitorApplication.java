package com.dawei.filemonitor;

import com.dawei.filemonitor.controller.ApacheMonitorDemo;
import com.dawei.filemonitor.controller.WatchServiceDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FilemonitorApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FilemonitorApplication.class, args);
        //WatchServiceDemo.filemoniter();
        ApacheMonitorDemo.filemonitor();
    }
}
