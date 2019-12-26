package com.stefanini.concurso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.concurso.repository.EnemRepository;


@Service
public class EnemService  {
	@Autowired
	EnemRepository enemRepository;
	
	
}
