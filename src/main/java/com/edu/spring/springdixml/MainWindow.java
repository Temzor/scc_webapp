package com.edu.spring.springdixml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MainWindow implements InitializingBean, DisposableBean {

    private MainWindow() {
    }

    private static class MainWindowHolder {
        static MainWindow instance = new MainWindow();
    }

    public static MainWindow getInstance() {
        return MainWindowHolder.instance;
    }

    public void show() {
        System.out.println("Show main window");
    }

    public void openConnection() {
        System.out.println("Main window open connection");
    }

    public void closeConnection() {
        System.out.println("Main window close connection");
    }

    @Override
    public void afterPropertiesSet() {
        openConnection();
    }

    @Override
    public void destroy() {
        closeConnection();
    }
}
