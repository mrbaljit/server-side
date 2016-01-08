////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2013, Suncorp Metway Limited. All rights reserved.
//
// This is unpublished proprietary source code of Suncorp Metway Limited.
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
////////////////////////////////////////////////////////////////////////////////
package nz.co.foo.controller;

import nz.co.foo.Todo;
import nz.co.foo.TodoService;
import nz.co.foo.domain.AppUser;
import nz.co.foo.domain.Company;
import nz.co.foo.repository.AppUserRepository;
import nz.co.foo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Inject
    AppUserRepository appUserRepository;

    @Inject
    CompanyRepository companyRepository;

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @RequestMapping(value = "/hello", method = GET)
    public String sayHello(){
        return "Hello there !";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AppUser> findAll() {
        final List<AppUser> resultList = new ArrayList<>();
        final Iterable<AppUser> all = appUserRepository.findAll();
        all.forEach(new Consumer<AppUser>() {
            @Override
            public void accept(AppUser appUser) {
                resultList.add(appUser);
            }
        });

        final Iterable<Company> cAll = companyRepository.findAll();
        cAll.forEach(new Consumer<Company>() {
            @Override
            public void accept(Company company) {
                System.out.println(company.getId());
                System.out.println(company.getName());
            }
        });


        return resultList;
    }

    @RequestMapping(value = "/getSample", method = GET)
    public List<Todo> getAll() {

/*
        List<Todo> td = new ArrayList<>();
        Todo tdo = new Todo();
        tdo.setName("Hello");
          td.add(tdo);


        tdo = new Todo();
        tdo.setName("World " + new Date()) ;
        td.add(tdo);
*/

           return todoService.getAll();
    }

}
