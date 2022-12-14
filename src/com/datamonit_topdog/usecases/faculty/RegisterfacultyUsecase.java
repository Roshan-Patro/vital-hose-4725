package com.datamonit_topdog.usecases.faculty;

import java.util.Scanner;

import com.datamonit_topdog.dao.FacultyDao;
import com.datamonit_topdog.dao.FacultyDaoImpl;

public class RegisterfacultyUsecase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter faculty name:");
		String facultyname = sc.nextLine();
		
		System.out.println("Enter faculty address:");
		String facultyaddress = sc.nextLine();
		
		System.out.println("Enter mobile number:");
		long mobile = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter email address:");
		String email = sc.nextLine();
		
		sc.close();
		
		FacultyDao dao = new FacultyDaoImpl();
		
		String result = dao.registerFaculty(facultyname, facultyaddress, mobile, email);
		
		System.out.println(result);
		
	}

}
