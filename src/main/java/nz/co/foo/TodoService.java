package nz.co.foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by u342597 on 07/01/2016.
 */

@Service
public class TodoService {


    public static final Logger LOGGER = LoggerFactory.getLogger(TodoService.class);

    public List<Todo> getAll() {

        List<Todo> td = new ArrayList<>();
        Todo tdo = new Todo();
        tdo.setName("Hello");
        td.add(tdo);


        tdo = new Todo();
        tdo.setName("World " + new Date()) ;
        td.add(tdo);

        LOGGER.info("Number of records returned : " + td.size());

        return td;
    }


}
