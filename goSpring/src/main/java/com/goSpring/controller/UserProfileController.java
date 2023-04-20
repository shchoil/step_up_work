package com.goSpring.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.goSpring.mapper.UserProfileMapper;
import com.goSpring.model.UserProfile;

@RestController
// '@RestController'는 스프링 프레임워크에서 제공하는 어노테이션 중 하나로 선언하면, 해당 클래스 REST 웹 서비스를 제공하는 컨트롤러로서 동작하게 됩니다. 이 어노테이션을 사용하면 '@ResponseBody' 어노테이션을 생략할 수 있으며,
// 간단하게 JSON/XML 등의 형태로 데이터를 반환할 수 있습니다.
public class UserProfileController {
	
	private UserProfileMapper mapper;
	
	public UserProfileController(UserProfileMapper mapper) {
		this.mapper = mapper;
	}
	
	@PostConstruct
//	'@PostConstruct'는 스프링 프레임워크에서 제공하는 어노테이션으로, 해당 클래스의 인스턴스가 생성된 후 초기화 작업이 필요한 메서드에 적용하는 것을 권장한다, 이 어노테이션이 적용된 메서드는 객체 생성 후 초기화를 위해 호출되는데,
//	이 때 객체가 완전히 생성된 후에 호출되므로 생성자에서 할 수 없는 초기화 작업을 수행할 수 있습니다.
//	public void init() {
//		userMap = new HashMap<String, UserProfile>();
//		userMap.put("1", new UserProfile("1", "홍길동", "111-1111", "서울시 강남구 대치1동"));
//		userMap.put("2", new UserProfile("2", "홍길자", "111-1112", "서울시 강남구 대치2동"));
//		userMap.put("3", new UserProfile("3", "홍길순", "111-1113", "서울시 강남구 대치3동"));
//	}
	
	@GetMapping("/user/{id}")
//	'@GetMapping'은 HTTP GET 요청을 처리하기 위한 메소드에 지정합니다. 즉, 클라이언트에서 GET 요청이 오면 해당 메소드가 실행 되어 처리 결과를 반환합니다.
//	'@GetMapping'어노테이션은 스프링 프레임워크4.3 버전 이후부터 사용 가능한데 기존에 에는 @RequestMapping(value="/hello", method=RequestMethod.GET)과 같이 사용했었으나, 간편하게 사용하기 위해 '@GetMapping'과 같은
//	축약형 어노테이션이 등장하게 되었다.
	public UserProfile getUserProfile(@PathVariable("id") String id) {
//	'@PathVariable' 은 RESTful 웹 서비스에서 URL 경로의 일부를 매개 변수로 사용할 수 있도록 합니다. 예를 들어,"/user/{id}"와 같은 URL 패턴에서 {id}부분은 변수로 처리되고, 이를 '@PathVariable' 어노테이션으로 받아와 헤당 변수에
//	매핑할 수 있습니다. 이를통해 URL경로의 일부를 변수로 활용해 원하는 결과를 반환하는 등의 작업이 가능합니다.
		return mapper.getUserProfile(id);
	}
	
	@GetMapping("/user/all")
	public List<UserProfile> getUserProfileList() {
		return mapper.getUserProfileList();
	}
	
	@PutMapping("/user/{id}")
//	'@PutMapping'은 HTTP PUT 요청에 대해 매핑되는 핸들러 메서드임을 나타내는 스프링 프레임워크의 어노테이션입니다. PUT 요청은 리소스를 생성하거나 업데이트할 때 사용됩니다. '@PutMapping' 어노테이션을 사용하면 PUT 요청에 대한 핸들러 메서드를
//	간단하게 정의 할 수 있습니다. '@PathVariable' 어노테이션을 사용하여 URL 경로에서 id 값을 가져오고 '@RequestBody' 어노테이션을 사용하여 요청 바디에서 User 객체를 가져옵니다. 이후에는 업데이트 로직을 처리하고 'ResponseEntity' 객체를 반
//	환하여 업데이트된 User 객체와 함께 HTTP 응답을 반환합니다.
	public void putUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
//	'@RequestParam'은 스프링 프레임워크에서 사용되는 어노테이션 중 하나로 HTTP 요청에서 특정한 파라미터 값을 가져오기 위해 사용됩니다. 즉, 클라이언트에서 HTTP 요청을 보낼 때 URL 또는 Request Body에 전달되는 파라미터 값을 가져오기 위해 사용됩니다.
//	예를 들어, 클라이언트에서 '/user?name=john&age=30'과 같은 요청을 보낼 때 '@RequestParam'을 사용하여 'name'과 'age' 파라미터 값을 가져올 수 있습니다.
		mapper.insertUserProfile(id, name, phone, address);
	}
	
	@PostMapping("/user/{id}")
//	'@PostMapping'은 HTTP POST 요청에 대한 처리를 지원하는 스프링의 어노테이션 중 하나입니다. 즉, POST 메소드에 대한 처리를 매핑하는 어노테이션입니다. 이를 이용해 클라이언트에서 전달된 요청 파라미터를 처리하고, 결과를 반환할 수 있습니다. 예를들어
//	사용자가 폼을 작성하고 제출할 때, 그 정보를 받아 처리하는 작업 등에 사용됩니다. 이를 위해, '@PostMapping'어노테이션 뒤에는 해당 요청 경로를 설정할 수 있으며, @RequestParam 등의 어노테이션을 사용해 요청 파라미터를 처리할 수 있습니다.
	public void postUserPforile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
		mapper.updateUserProfile(id, name, phone, address);
	}
	
	@DeleteMapping("/user/{id}")
//	'@DeleteMapping'은 스프링 프레임워크에서 제공하는 HTTP DELETE메서드 매핑 어노테이션 중 하나입니다. '@DeleteMapping' 어노테이션을 사용하면 HTTP DELETE요청을 처리할 수 있는 메서드를 쉽게 작성할 수 있습니다.
	public void deleteUserProfile(@PathVariable("id") String id) {
		mapper.deleteUserProfile(id);
	}
}
