package kr.or.yi.erd_exam.dto;

public class Title {
	private String no;
	private String titleName;
	
	public Title() {
		// TODO Auto-generated constructor stub
	}

	public Title(String no) {
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
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
