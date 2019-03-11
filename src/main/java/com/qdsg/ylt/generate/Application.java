package com.qdsg.ylt.generate;

import com.qdsg.ylt.generate.business.CodeGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author : wangzhe
 * @Create: :2018-10-15 09:48
 * @Description : ${description}
 * @Modified By :
 */

@SpringBootApplication(scanBasePackages = {"com.qdsg.ylt"},exclude = DataSourceAutoConfiguration.class)
public class Application implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private CodeGenerate codeGenerate;

    @Override
    public void run(String... args) throws Exception {
        codeGenerate.execute();
    }

}
