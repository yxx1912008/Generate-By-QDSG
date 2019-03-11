package com.qdsg.ylt.generate.business;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.qdsg.ylt.generate.config.CodeGenerateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author yangjq
 * @Description：代码生成器
 * @Date：Created in 11:12 2018/10/12
 * @Modified by:
 */
@Component
public class CodeGenerate {

    @Autowired
    private CodeGenerateConfig config;

    /**
    * @Author:yjq
    * @Description:生成代码
    * @Date: 11:13 2018/10/12
    */
    public void
    execute(){
        AutoGenerator mpg = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(config.getGlobalConfig().getOutputDir()); //输出文件路径
        gc.setFileOverride(true);
        gc.setActiveRecord(false); //ActiveRecode特性
        gc.setEnableCache(false);
        gc.setBaseResultMap(true); //resultMap
        gc.setBaseColumnList(true); // columList
        gc.setAuthor(config.getGlobalConfig().getAuthor()); //作者

        //自定义文件名，%s属性会自动填充表实体属性
        gc.setControllerName("%sController");
        gc.setServiceName("I%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName(config.getDataSource().getDriverName());
        dsc.setUsername(config.getDataSource().getUsername());
        dsc.setPassword(config.getDataSource().getPassword());
        dsc.setUrl(config.getDataSource().getUrl());
        mpg.setDataSource(dsc);

        //策略配置
        StrategyConfig sc = new StrategyConfig();
        //sc.setTablePrefix(new String[]{"ylt_"}); //表前缀
        sc.setNaming(NamingStrategy.underline_to_camel); //表名生成策略
        sc.setInclude(config.getTableNames()); //需要生成的表

        sc.setSuperServiceClass(null);
        sc.setSuperServiceImplClass(null);
        sc.setSuperMapperClass(null);

        mpg.setStrategy(sc);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(config.getPackageConfig().getParent());
        pc.setController(config.getPackageConfig().getController());
        pc.setService(config.getPackageConfig().getService());
        pc.setServiceImpl(config.getPackageConfig().getServiceImpl());
        pc.setMapper(config.getPackageConfig().getMapper());
        pc.setEntity(config.getPackageConfig().getEntity());
        pc.setXml(config.getPackageConfig().getXml());
        mpg.setPackageInfo(pc);

        //执行生成
        mpg.execute();
    }
}
