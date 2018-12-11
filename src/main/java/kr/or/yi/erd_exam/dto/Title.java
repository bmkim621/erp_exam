package kr.or.yi.erd_exam.dto;

public class Title {
	private int no;
	private String titleName;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	@Override
	public String toString() {
		return String.format("Title [no=%s, titleName=%s]", no, titleName);
	}
}
