package br.com.rodrigo.dataintegration.twodb.service.impl;

import br.com.rodrigo.dataintegration.twodb.db.mysql.model.*;
import br.com.rodrigo.dataintegration.twodb.db.mysql.repository.*;
import br.com.rodrigo.dataintegration.twodb.db.postgresql.model.*;
import br.com.rodrigo.dataintegration.twodb.db.postgresql.repository.*;
import br.com.rodrigo.dataintegration.twodb.service.*;
import jakarta.transaction.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
@Slf4j
public class ConsultaServiceImpl implements ConsultaService {

    @Autowired
    private MysqlRepository mysqlRepository;
    @Autowired
    private PostgresqlRepository postgresqlRepository;

    @Override
    public String executar(String productOperationId) {
        Cliente o = mysqlRepository.findById(1L).get();
        Context c = postgresqlRepository.findById(12345678909L).get();
        System.out.println("Object (MySQL): " + o.getNome());
        System.out.println("Context (PostgreSQL): " + c.getInstitution());
        return "15-12345678909";
    }
}
