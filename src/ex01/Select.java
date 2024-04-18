package ex01;

import java.util.ArrayList;

public class Select {
	
	
	public void select() {
		
		//싱글톤 객체 불러옴
		DAO dao = DAO.getInstance();
		
		ArrayList<DTO> list = dao.select();
		
		for(DTO dto : list) {
			System.out.printf("%s\t\t%s\t\t%s\t\t\t%s\t\t\t"
					, dto.getMenunum(), dto.getMenuname(), dto.getPrice(), dto.getCategory()
					);	
		}
		
		
		
	}


}
