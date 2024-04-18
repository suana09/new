package ex01;

public class DTO {
	
	private int menunum;
	private String menuname;
	private int price;
	private String category;
	
	public int getMenunum() {
		return menunum;
	}
	public void setMenunum(int menunum) {
		this.menunum = menunum;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "DTO [menunum=" + menunum + ", menuname=" + menuname + ", price=" + price + ", category=" + category
				+ "]";
	}
	
	
	

}
