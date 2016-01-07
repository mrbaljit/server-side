////////////////////////////////////////////////////////////////////////////////
//
// Copyright (c) 2013, Suncorp Metway Limited. All rights reserved.
//
// This is unpublished proprietary source code of Suncorp Metway Limited.
// The copyright notice above does not evidence any actual or intended
// publication of such source code.
//
////////////////////////////////////////////////////////////////////////////////
package nz.com.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/case-service")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    /**
     * @since v0
     */
    @RequestMapping(value = "/getAll", method = GET)
    public List<Todo> findAll() {

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
