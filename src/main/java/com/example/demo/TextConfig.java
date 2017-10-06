package com.example.demo;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    private String text = "jdbc:oracle:thin:@oracle_tdb:1521/test";
    private String text1 = "jdbc:oracle:thin:@oracle_tdb2:1521/test";
    private String text2 = "jdbc:oracle:thin:@oracle_tdb3:1521/test";
    private String text3 = "jdbc:oracle:thin:@oracle_tdb4:1521/test";


}
