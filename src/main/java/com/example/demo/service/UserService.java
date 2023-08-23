package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo sr;
	public UserModel saveinfo(UserModel ss)
	{
		return sr.save(ss);
	}
	public List<UserModel>savedetails(List<UserModel>ss)
	{
		return (List<UserModel>)sr.saveAll(ss);
	}
	public Optional<UserModel> gettinfo(int id)
	{
		return sr.findById(id);
	}
	public List<UserModel>showinfo()
	{
		return sr.findAll();
	}
	public UserModel changeinfo(UserModel ss)
	{ 
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(UserModel ss)
	{
		sr.delete(ss);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
	public String updatebyid(int id,UserModel ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}
	}
}
