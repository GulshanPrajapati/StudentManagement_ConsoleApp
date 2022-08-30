package com.gulshan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.gulshan.student.manage.Student;
import com.gulshan.student.manage.insert_student_data;

public class Main {

	public static void main(String[] args)throws IOException {
		System.out.println("Hello JDBC");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Students");
			System.out.println("Press 4 to Exit");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//Add Student
				System.out.println("Enter Last Name : ");
				String lname = br.readLine();

				System.out.println("Enter First Name : ");
				String name = br.readLine();
				
				System.out.println("Enter City : ");
				String city = br.readLine();
				
				Student st = new Student(lname,name, city);
				boolean ans = insert_student_data.insertStudentDataToDatabase(st);
				if(ans) {
					System.out.println("Studentr added");
				}else {
					System.out.println("Somthing WEnt Wrong...");
				}
				System.out.println(st);
				
			}else if(c==2) {
				//delete 
				System.out.println("Enter Student Id to Delete the data : ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = insert_student_data.deleteStudent(userId);
				if(f) {
					System.out.println("Delete Successfully");
				}else {
					System.out.println("Somthing went Wrong");
				}
			}else if(c==3) {
				//display
				insert_student_data.showAllStudents();
			}else if(c==4) {
//				exit
				break;
			}
		}
		System.out.println("Thanks for Using App See you Soon..!");

	}

}
