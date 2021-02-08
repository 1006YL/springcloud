package web.controler;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.yl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class consumercontroler {

    @Autowired
    private RestTemplate restTemplate;
    private static final String REST_URL_PREFIX="http://PROVIDER-SERVICE";

    @RequestMapping("/getall/")
    public List<User> selectall(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/select",List.class);
    }


}
