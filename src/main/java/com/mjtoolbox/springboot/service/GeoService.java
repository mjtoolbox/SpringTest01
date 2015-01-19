package com.mjtoolbox.springboot.service;

import com.mjtoolbox.springboot.model.Grid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by msjo on 1/10/2015.
 */
// It tells us this controller will handle all requests beginning with "/api"
@RequestMapping("/api/**")
// Convenient annotation that does nothing more than adding the @Controller and @ResponseBody annotation
@RestController
public class GeoService {

    @RequestMapping(method= RequestMethod.GET,  produces = {MediaType.APPLICATION_JSON_VALUE} )
    public Grid getGrid(){
        return new Grid("myposition", 10, 20);
    }

}
