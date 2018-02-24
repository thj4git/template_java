package com.thj;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 这个类需要放在最顶层,默认从boot类当前所在package开始扫描
 * @author thj_pc_3
 *
 */
@SpringBootApplication
@EnableTransactionManagement //如果mybatis中service实现类中加入事务注解，需要此处添加该注解
@MapperScan("com.thj.mapper")//扫描的是mapper.xml中namespace指向值的包位置即 Mapper.java文件的地址
public class Application {

	public static void main(String[] args) {
		System.out.println("------服务器启动---------");
		SpringApplication.run(Application.class, args);
	}
	
	/**
	 * 配置返回值默认为json
	 * @return
	 */
	@Bean  
    public MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter() {  
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();  
        ObjectMapper objectMapper = new ObjectMapper();  
        //设置返回json时,如果字段为空的则不返回该字段
        objectMapper.setSerializationInclusion(Include.NON_NULL);
        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);  
        //设置中文编码格式  
        List<MediaType> list = new ArrayList<MediaType>();  
        list.add(MediaType.APPLICATION_JSON_UTF8);  
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(list);  
        return mappingJackson2HttpMessageConverter;  
    }  
}
