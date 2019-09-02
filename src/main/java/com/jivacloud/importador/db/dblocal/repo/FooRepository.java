package com.jivacloud.importador.db.dblocal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jivacloud.importador.db.dblocal.domain.Foo;

@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {

  Foo findById(Long id);

}
