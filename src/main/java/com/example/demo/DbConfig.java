package com.example.demo;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    private String url = "jdbc:oracle:thin:@oracle_db:1521/test";
    private String ur2 = "jdbc:oracle:thin:@oracle_db2:1521/test";
    private String ur3 = "jdbc:oracle:thin:@oracle_db3:1521/test";
    private String ur4 = "jdbc:oracle:thin:@oracle_db4:1521/test";


}
