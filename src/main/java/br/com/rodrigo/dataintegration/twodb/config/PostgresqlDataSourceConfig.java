package br.com.rodrigo.dataintegration.twodb.config;

import org.springframework.boot.context.properties.*;
import org.springframework.boot.jdbc.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

import javax.sql.*;

@Configuration
@EnableJpaRepositories(
        basePackages = "br.com.rodrigo.dataintegration.twodb.db.postgresql.repository",
        entityManagerFactoryRef = "postgresqlEntityManagerFactory",
        transactionManagerRef = "postgresqlTransactionManager"
)
public class PostgresqlDataSourceConfig {

    @Bean(name = "postgresqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.postgresql")
    public DataSource postgresqlDataSource() {
        return DataSourceBuilder.create().build();
    }
}