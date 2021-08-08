package cybersoft.javabackend.java12.gira.role.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java12.gira.role.entity.Role;

@RestController
@RequestMapping("/api/role")
public class RoleController {

	@GetMapping
	public Object findAllRole() {
		List<Role> roles = new ArrayList<>();
		return new ResponseEntity<>(roles, HttpStatus.OK);
				
	}
}
