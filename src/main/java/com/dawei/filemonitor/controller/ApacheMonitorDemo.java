package com.dawei.filemonitor.controller;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ApacheMonitorDemo {
    public static void filemonitor() throws Exception {
        File directory = new File("F:\\test");
        // 轮询间隔 5 秒
        long interval = TimeUnit.SECONDS.toMillis(10);
        // 创建一个文件观察器用于处理文件的格式
        FileAlterationObserver observer = new FileAlterationObserver(directory, FileFilterUtils.and( FileFilterUtils.fileFileFilter(),
                FileFilterUtils.suffixFileFilter(".txt")));
        //设置文件变化监听器
        observer.addListener(new FileListenerDemo());
        FileAlterationMonitor monitor = new FileAlterationMonitor(interval,observer);
        monitor.start();
    }
}
