package com.qdsg.ylt.generate.config;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.qdsg.ylt.generate.config.configclass.DataSource;
import com.qdsg.ylt.generate.config.configclass.PackageConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author yangjq
 * @Description：代码生成配置类
 * @Date：Created in 14:28 2018/10/12
 * @Modified by:
 */
@Component
@ConfigurationProperties(prefix = "generate")
public class CodeGenerateConfig {

    private String[] tableNames;

    private GlobalConfig globalConfig;

    private DataSource dataSource;

    private PackageConfig packageConfig;

    public String[] getTableNames() {
        return tableNames;
    }

    public void setTableNames(String[] tableNames) {
        this.tableNames = tableNames;
    }

    public PackageConfig getPackageConfig() {
        return packageConfig;
    }

    public void setPackageConfig(PackageConfig packageConfig) {
        this.packageConfig = packageConfig;
    }

    public GlobalConfig getGlobalConfig() {
        return globalConfig;
    }

    public void setGlobalConfig(GlobalConfig globalConfig) {
        this.globalConfig = globalConfig;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
