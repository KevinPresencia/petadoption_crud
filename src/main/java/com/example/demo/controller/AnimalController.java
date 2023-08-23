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

import com.example.demo.model.AnimalModel;
import com.example.demo.service.AnimalService;
@RestController

public class AnimalController {
	@Autowired
AnimalService sser;
	
	@PostMapping("addpet")
	public AnimalModel add(@RequestBody AnimalModel ss) {
		return sser.saveinfo(ss);
	}
	@PostMapping("addnpet")
	public List<AnimalModel> addndetails(@RequestBody List<AnimalModel> ss) 
	{
		return sser.savedetails(ss);
	}
	@GetMapping("showpet")
	public List<AnimalModel>show()
	{
		return sser.showinfo();
	}
	@GetMapping("getpet/{id}")
	public Optional<AnimalModel>getinfo(@PathVariable int id)
	{
		return sser.gettinfo(id);
	}
	@PutMapping ("updatepet")
	public AnimalModel modify(@RequestBody AnimalModel ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping ("deletepet")
	public String del(@RequestBody AnimalModel ss)
	{
		sser.deleteinfo(ss);
		return "Deleted successfully";
	}
	@DeleteMapping("delpetid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		sser.deleteid(id);
	}
	@DeleteMapping("delpetparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		sser.deletepid(id);
	}
	@PutMapping("updatepetid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody AnimalModel ss)
	{
		return sser.updatebyid(id,ss);
	}
	
}
