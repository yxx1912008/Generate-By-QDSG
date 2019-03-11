package com.qdsg.ylt.generate.config.configclass;

/**
 * @Author yangjq
 * @Description：数据库连接属性
 * @Date：Created in 15:26 2018/10/12
 * @Modified by:
 */
public class DataSource {

    private String url;

    private String username;

    private String password;

    private String driverName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
