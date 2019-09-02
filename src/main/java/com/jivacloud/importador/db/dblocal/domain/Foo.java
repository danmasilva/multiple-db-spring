package com.jivacloud.importador.db.dblocal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "foo")
@Data
public class Foo {

  @Id
  @Column(name = "ID")
  private Long id;

  @Column(name = "FOO")
  private String foo;

  Foo(String foo) {
    this.foo = foo;
  }

  Foo() {
  }

  public String getFoo() {
    return foo;
  }

}
