package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * JavaBookManagementSystem
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/28 20:56
 * @since JDK17
 */

@Configuration
@MapperScan("com.example.mapper")
public class MyBatisPlusConfig {

    /**
     * 添加分页插件
     */
    @Bean
    public PaginationInterceptor mybatisPlusInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作，true调回到首页，false继续请求，默认为false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认为500条，-1不受限制
        // paginationInterceptor.setLimit(500);
        // 开启count的join优化，只针对部分left join
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true)); // 如果配置多个插件, 切记分页最后添加
        // 如果有多数据源可以不配具体类型, 否则都建议配上具体的 DbType
        return paginationInterceptor;
    }

}

