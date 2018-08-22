package com.gk.userservice.endpoints;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import feign.RequestLine;


@RestController
@RequestMapping("users")
@FeignClient(url="localhost:8090/users")
public interface UserService {
	
	@RequestMapping(value="/getusernames", method=RequestMethod.GET)
	
	@RequestLine("GET")
	public String getUserNames();
	
	@RequestMapping(value="/getuserids", method=RequestMethod.GET)
	
	@RequestLine("GET")
	public String getUserIds();

}
