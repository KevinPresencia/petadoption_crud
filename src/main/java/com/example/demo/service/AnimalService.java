package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnimalModel;
import com.example.demo.repository.AnimalRepo;

@Service

public class AnimalService {
	@Autowired
	AnimalRepo sr;
	public AnimalModel saveinfo(AnimalModel ss)
	{
		return sr.save(ss);
	}
	public List<AnimalModel>savedetails(List<AnimalModel>ss)
	{
		return (List<AnimalModel>)sr.saveAll(ss);
	}
	public Optional<AnimalModel> gettinfo(int id)
	{
		return sr.findById(id);
	}
	public List<AnimalModel>showinfo()
	{
		return sr.findAll();
	}
	public AnimalModel changeinfo(AnimalModel ss)
	{ 
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(AnimalModel ss)
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
	public String updatebyid(int id,AnimalModel ss)
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
