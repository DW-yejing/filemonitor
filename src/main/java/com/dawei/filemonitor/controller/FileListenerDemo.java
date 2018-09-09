package com.dawei.filemonitor.controller;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

public class FileListenerDemo implements FileAlterationListener {

    @Override
    public void onStart(FileAlterationObserver fileAlterationObserver) {
        System.out.println("正在执行onstart");
    }

    @Override
    public void onDirectoryCreate(File file) {
        System.out.println("新建文件夹事件");
    }

    @Override
    public void onDirectoryChange(File file) {
        System.out.println("文件夹更新事件");
    }

    @Override
    public void onDirectoryDelete(File file) {
        System.out.println("文件夹删除事件");
    }

    @Override
    public void onFileCreate(File file) {
        System.out.println("新建文件事件");
    }

    @Override
    public void onFileChange(File file) {
        System.out.println("文件更新事件:\t"+file.getName());
    }

    @Override
    public void onFileDelete(File file) {
        System.out.println("文件删除事件");
    }

    @Override
    public void onStop(FileAlterationObserver fileAlterationObserver) {
        //System.out.println("正在执行onstop");
    }
}
