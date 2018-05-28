package sps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SPScontroller {
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public SPSfact test() throws Exception{
    	return SPSexec.testSP1("SP1");
    }
    
    @RequestMapping(value = "/test2", method = RequestMethod.GET, produces = "application/json")
    public SPSfact test2() throws Exception{
    	return SPSexec.testSP2("SP2");
    }	    
    
}
