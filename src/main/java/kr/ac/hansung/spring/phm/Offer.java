package kr.ac.hansung.spring.phm;

public class Offer {

	private int years;
	private int semester;
	private String code;
	private String division;
	private String name;
	private int credit;

	public Offer() {

	}

	public Offer(int years, int semester, String code, String division, String name, int credit) {

		this.years = years;
		this.semester = semester;
		this.code = code;
		this.division = division;
		this.name = name;
		this.credit = credit;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String toString() {
		return "Offer [years=" + years + ", semester=" + semester + ", code=" + code + ", division=" + division
				+ ", name=" + name + ", credit=" + credit + "]";
	}
}
