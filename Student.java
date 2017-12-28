public class Student {

	protected String name;
	protected char gender;
	protected int birthDay;
	protected int pref;
	protected boolean match;
	
	int score = 0;
	
	public Student(String name, char gender, int birthDay, int pref) { // constructor
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
		this.pref = pref;
	}
	
	public void setName(String name) { // mutator
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setBirthDay( int birthDay) {
		this.birthDay = birthDay;
	}
	
	public void setPref(int pref) {
		this.pref = pref;
	}
	
	public void setMatch(boolean match){
		this.match = match;
	}
	
	public String getName() { // Accessor
		return name;
	}	
	
	public char getGender() {
		return gender;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public int getPref(){
		return pref;
	}
	
	public boolean getMatch() {
		return match;
	}
	
	public int compare(Student st) {
		if (this.gender == st.gender) {
			int a = (st.getPref());
			 int b = (st.getBirthDay());
			 
			 score = (40 -a) + (60-b);
		}
		if (score > 100) {
			return score = 100;
		}
		else if (score <= 100 && score >= 0) {
			return score;
		}
		else 
			return score = 0;
		
		
		
	}

	

}
