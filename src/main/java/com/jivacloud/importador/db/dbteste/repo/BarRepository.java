package com.jivacloud.importador.db.dbteste.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jivacloud.importador.db.dbteste.domain.Bar;


@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {

  Bar findById(Long id);

}
