package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService us;
	
	@PostMapping("adduser")
	public UserModel add(@RequestBody UserModel ss) 
	{
		return us.saveinfo(ss);
	}
	@PostMapping("addnuser")
	public List<UserModel> addndetails(@RequestBody List<UserModel> ss) 
	{
		return us.savedetails(ss);
	}
	@GetMapping("showuser")
	public List<UserModel>show()
	{
		return us.showinfo();
	}
	@GetMapping("getuser/{id}")
	public Optional<UserModel>getinfo(@PathVariable int id)
	{
		return us.gettinfo(id);
	}
	@PutMapping ("updateuser")
	public UserModel modify(@RequestBody UserModel ss)
	{
		return us.changeinfo(ss);
	}
	@PutMapping("updateuserid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody UserModel ss)
	{
		return us.updatebyid(id,ss);
	}
	@DeleteMapping ("deleteuser")
	public String del(@RequestBody UserModel ss)
	{
		us.deleteinfo(ss);
		return "Deleted successfully";
	}
	@DeleteMapping("deluser/{id}")
	public String deletemyid(@PathVariable int id)
	{
		us.deleteid(id);
		return "Deleted successfully";
	}
	@DeleteMapping("deluserid")
	public void deletemyparamid(@RequestParam int id)
	{
		us.deletepid(id);
	}
	
}
