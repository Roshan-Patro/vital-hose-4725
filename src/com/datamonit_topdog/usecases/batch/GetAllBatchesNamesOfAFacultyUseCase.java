package com.datamonit_topdog.usecases.batch;

import java.util.List;
import java.util.Scanner;

import com.datamonit_topdog.dao.BatchDao;
import com.datamonit_topdog.dao.BatchDaoImpl;
import com.datamonit_topdog.exceptions.BatchException;

public class GetAllBatchesNamesOfAFacultyUseCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the faculty id that you want to see all batches for:");
		int facultyId = sc.nextInt();
		
		BatchDao dao = new BatchDaoImpl();
		
		try {
			List<String> batchList = dao.getAllBatchesNamesOfAFaculty(facultyId);
			
			batchList.forEach(c -> System.out.println(c));
			
		} catch (BatchException e) {
			System.out.println(e.getMessage());
		}

	}

}
