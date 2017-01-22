package controller;

import dao.DBConnection;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ExampleContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        DBConnection db = new DBConnection();
        db.createTable();
    }


    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        DBConnection db = new DBConnection();
        db.dropConnection();
    }

}
