package com.example.cruddemojpa.dao;

import com.example.cruddemojpa.entity.Instructor;
import com.example.cruddemojpa.entity.InstructorDetail;

public interface AppDAO {

	void save(Instructor theInstructor);
	
	Instructor findInstructorById(int theId);
	
	void deleteInstructorById(int theId);
	
	InstructorDetail findInstructorDetailById(int theId);
	
	void deleteInstructorDetailById(int theId);
}
