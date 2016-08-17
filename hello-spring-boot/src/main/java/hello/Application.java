package hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String home() {

		return "Hello Openshift....POD IP is: " + getPodIP() + "  Version: 1";
	}

	@RequestMapping(value = "/process", method = RequestMethod.GET)
	@ResponseBody
	public String send(final HttpServletRequest request) throws Exception {

		String url = "http://" + env.getProperty("HAI_SERVICE_HOST") + ":" + env.getProperty("HAI_SERVICE_PORT");

		ResponseEntity<String> response = new RestTemplate().getForEntity(url, String.class);

		System.out.println("Response is..." + response.getBody());

		return response.getBody();

	}

	public static String getPodIP() {
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
