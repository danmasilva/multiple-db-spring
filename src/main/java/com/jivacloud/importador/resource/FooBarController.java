package com.jivacloud.importador.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jivacloud.importador.db.dblocal.domain.Foo;
import com.jivacloud.importador.db.dblocal.repo.FooRepository;
import com.jivacloud.importador.db.dbteste.domain.Bar;
import com.jivacloud.importador.db.dbteste.repo.BarRepository;


@RestController
public class FooBarController {

  private final FooRepository fooRepo;
  private final BarRepository barRepo;

  @Autowired
  FooBarController(FooRepository fooRepo, BarRepository barRepo) {
    this.fooRepo = fooRepo;
    this.barRepo = barRepo;
  }

  @RequestMapping("/foobar/{id}")
  public String fooBar(@PathVariable("id") Long id) {
    Foo foo = fooRepo.findById(id);
    Bar bar = barRepo.findById(id);

    return foo.getFoo() + " " + bar.getBar() + "!";
  }
  
  @PostMapping("/foobar")
  public ResponseEntity<Foo> postFoo(@RequestBody Foo foo) {
    Foo savedFoo = fooRepo.save(foo);
    return ResponseEntity.ok().body(savedFoo);
  }

}
