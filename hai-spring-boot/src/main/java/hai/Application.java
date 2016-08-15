package hai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
   
	@RequestMapping("/")
	public String home() {

		
		return "Hai Openshift....from POD IP is: "+getPodIP();
	}
	
	public static String getPodIP(){
		String ip = "";
		try {
			
			ip = java.net.InetAddress.getLocalHost().getHostAddress();

		} catch (Exception e) {

		}
		
		return ip;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
