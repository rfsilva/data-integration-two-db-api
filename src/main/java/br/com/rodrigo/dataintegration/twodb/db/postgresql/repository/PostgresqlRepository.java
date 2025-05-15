package br.com.rodrigo.dataintegration.twodb.db.postgresql.repository;

import br.com.rodrigo.dataintegration.twodb.db.postgresql.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.*;

import java.time.*;
import java.util.*;

public interface PostgresqlRepository extends JpaRepository<Context, Long> {

    @Query(value = "select c from Context c where c.date = :date and c.institution = :institution and c.branch = :branch and c.type = :type and c.sequential = :sequential")
    Optional<Context> getContext(
            @Param("date") LocalDate date,
            @Param("institution") Long institution,
            @Param("branch") Long branch,
            @Param("type") Integer type,
            @Param("sequential") Long sequential);
}
