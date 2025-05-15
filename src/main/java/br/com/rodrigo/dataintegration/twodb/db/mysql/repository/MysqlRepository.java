package br.com.rodrigo.dataintegration.twodb.db.mysql.repository;

import br.com.rodrigo.dataintegration.twodb.db.mysql.model.*;
import org.springframework.data.jpa.repository.*;

public interface MysqlRepository extends JpaRepository<Cliente, Long> {
}