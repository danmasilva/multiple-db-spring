package com.jivacloud.importador.db.dbteste.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "bar")
@Data
public class Bar {

  @Id
  @Column(name = "ID")
  private Long id;

  @Column(name = "BAR")
  private String bar;

  Bar(String bar) {
    this.bar = bar;
  }

  Bar() {
  }

  public String getBar() {
    return bar;
  }
}
