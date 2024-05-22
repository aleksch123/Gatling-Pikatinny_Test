package ru.dot.invest.base;

import io.gatling.javaapi.http.HttpProtocolBuilder;

import java.util.Properties;

import static io.gatling.javaapi.http.HttpDsl.http;

public class BaseTest {

    public static Properties properties =PropsLoader.init("src/test/resources/project.properties");
    public static String loginUrl = properties.getProperty("login.url");
    public static String hostUrl = properties.getProperty("host.url");
    public static int portGrpc = Integer.parseInt(properties.getProperty("port.grpc"));
    public static String hostGrpc = properties.getProperty("host.grpc");
    public static String  realm=properties.getProperty("realm.uri");




    



    public static HttpProtocolBuilder httpProtocol = http
            .baseUrl(hostUrl)
            .disableFollowRedirect();




}
