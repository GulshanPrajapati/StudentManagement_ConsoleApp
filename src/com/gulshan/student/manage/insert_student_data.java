package com.gulshan.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class insert_student_data {

	public static boolean insertStudentDataToDatabase(Student st) {
		boolean f = false;
		try {
			Connection con = Connection_con.createC();
			String  q = "insert into persons(FirstName,LastName,City) values(?,?,?)";
			PreparedStatement pstmt =  con.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();
			f = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {

			boolean f = false;
			try {
				Connection con = Connection_con.createC();
				String  q = "Delete From persons where PersonId=?";
				PreparedStatement pstmt =  con.prepareStatement(q);
				pstmt.setInt(1,userId);
				
				pstmt.executeUpdate();
				f = true;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return f;
		
	}
	
	public static boolean showAllStudents() {
		boolean f =false;
			try {
				Connection con = Connection_con.createC();
				String  q = "select * from persons;";
				java.sql.Statement stmt = con.createStatement();
				ResultSet set = ((java.sql.Statement) stmt).executeQuery(q);
				while(set.next()) {
					int id= set.getInt(1);
					String FirstName = set.getString(2);
					String LastName = set.getString(3);
					String City = set.getString(4);
					
					System.out.println("id : " + id);
					System.out.println("FirstName : " + FirstName);
					System.out.println("LastName : " + LastName);
					System.out.println("City : " + City);
					System.out.println("---------------------------------------");
					f=true;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return f;
	}

}
