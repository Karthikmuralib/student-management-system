package com.sms.dao;

import java.sql.*;
import com.sms.model.Student;
import com.sms.util.DBUtil;

public class StudentDAO {

    // ADD STUDENT
    public void addStudent(Student s) {
        String sql = "INSERT INTO students (name,email,phone,course,dob,gender) VALUES (?,?,?,?,?,?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPhone());
            ps.setString(4, s.getCourse());
            ps.setDate(5, s.getDob());
            ps.setString(6, s.getGender());

            ps.executeUpdate();
            System.out.println("✅ Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE COURSE
    public void updateCourse(int id, String course) {
        String sql = "UPDATE students SET course=? WHERE id=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, course);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("✅ Student Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // UPDATE EMAIL
    public void updateEmail(int id, String email) {
        String sql = "UPDATE students SET email=? WHERE id=?";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("✅ Email Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // UPDATE PHONE NUMBER
    
    public void updatePhone(int id, String phone) {
        String sql = "UPDATE students SET phone=? WHERE id=?";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, phone);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("✅ Phone Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // DELETE STUDENT
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("✅ Student Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW STUDENTS
    public void viewStudents() {
        String sql = "SELECT * FROM students";

        try (Connection con = DBUtil.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
        	System.out.println(
        		    "+----+------------+----------------------+------------+---------------+------------+----------+");
        		System.out.printf(
        		    "| %-2s | %-10s | %-20s | %-10s | %-13s | %-10s | %-8s |\n",
        		    "ID", "NAME", "EMAIL", "PHONE", "COURSE", "DOB", "GENDER");
        		System.out.println(
        		    "+----+------------+----------------------+------------+---------------+------------+----------+");


            while (rs.next()) {
            	
            
            		System.out.printf(
            			    "| %-2d | %-10s | %-20s | %-10s | %-13s | %-10s | %-8s |\n",
            			    rs.getInt("id"),
            			    rs.getString("name"),
            			    rs.getString("email"),
            			    rs.getString("phone"),
            			    rs.getString("course"),
            			    rs.getDate("dob"),
            			    rs.getString("gender")
            			);
            		System.out.println(
            			    "+----+------------+----------------------+------------+---------------+------------+----------+");


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

