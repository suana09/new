package ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DAO {
	
	//singleton pattern
	public static DAO dao = new DAO();
	private DAO() {}
	public static DAO getInstance() {
		return dao;
	}
	
	
	//연결객체, 실행객체, 결과값객체
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public void insert() {
		
		con = DatabaseManager.getCon();
		String sql = "insert into menulist (menuname, price, category) values (?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "딸기라떼");
			pstmt.setInt(2,  6500);
			pstmt.setString(3, "주스/라떼");
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.close(con, pstmt, rs);
		}
		
		
	}
	
	
	public ArrayList<DTO> select() {
		DTO dto = new DTO();
		ArrayList<DTO> list = new ArrayList<>();
		con = DatabaseManager.getCon();
		String sql = "select * from menulist";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				dto.setMenunum(rs.getInt("menunum"));
				dto.setMenuname(rs.getString("menuname"));
				dto.setPrice(rs.getInt("price"));
				dto.setCategory(rs.getString("category"));
				
				list.add(dto);
			}

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseManager.close(con, pstmt, rs);
		}
		
		
		
		return list;
	}
	
	

}
