package com.capg.layer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.capg.util.JDBC_Util;

public class StudentDAO {

    // INSERT
    public int addStudent(StudentBean sb) throws Exception {
        int status = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = JDBC_Util.getConnection();

            String query = "INSERT INTO STUDENT2 VALUES (?,?,?,?)";
            pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, sb.getStudentId());
            pstmt.setString(2, sb.getName());
            pstmt.setDouble(3, sb.getMarks());
            pstmt.setString(4, sb.getResult());

            status = pstmt.executeUpdate();
        }
        finally {
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        }

        return status;
    }

    // FETCH
    public StudentBean getStudent(int id) {
        StudentBean sb = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBC_Util.getConnection();

            String query = "SELECT * FROM STUDENT2 WHERE STUDENT_ID = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                sb = new StudentBean();
                sb.setStudentId(rs.getInt(1));
                sb.setName(rs.getString(2));
                sb.setMarks(rs.getDouble(3));
                sb.setResult(rs.getString(4));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {}
        }

        return sb;
    }

    // UPDATE
    public int updateStudent(int id, String newName) {
        int status = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = JDBC_Util.getConnection();

            String query = "UPDATE STUDENT2 SET NAME = ? WHERE STUDENT_ID = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, newName);
            pstmt.setInt(2, id);

            status = pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {}
        }

        return status;
    }

    // DELETE
    public int deleteStudent(int id) {
        int status = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = JDBC_Util.getConnection();

            String query = "DELETE FROM STUDENT2 WHERE STUDENT_ID = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);

            status = pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {}
        }

        return status;
    }
}
