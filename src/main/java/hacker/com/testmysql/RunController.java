package hacker.com.testmysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hacker.com.model.Users;
import hacker.com.repository.UserJpaRepository;

@RestController
@RequestMapping("/user")
public class RunController {
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	@GetMapping("/showAll")
	public List<Users> listAll(){
		return userJpaRepository.findAll();
	}
	
	@PostMapping("/save")
	public List<Users> persist(@RequestBody final Users user){
		System.out.println("having request to save");
		userJpaRepository.save(user);
		System.out.println("done with request to save");
		return userJpaRepository.findAll();
	}

}
