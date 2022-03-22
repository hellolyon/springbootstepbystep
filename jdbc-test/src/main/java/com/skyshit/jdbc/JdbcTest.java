package com.skyshit.jdbc;

import java.sql.*;

public class JdbcTest {

    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test_sql";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123456";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //注册mysql数据库驱动
            Class.forName(DRIVER_NAME);
            //连接数据库
            conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            //查询sql
            //String sql = "select * from user";
            String sql = "select NOW() currentTime";
            //执行查询语句
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                //System.out.println("名称："+rs.getString("name"));
                System.out.println("当前时间："+rs.getString("currentTime"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (conn != null){
                    //关闭数据库连接
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
