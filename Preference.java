public class Preference {

	protected int quietTime, music, reading, chatting;
	
	public Preference(int quietTime, int music, int reading, int chatting) {
		if (quietTime >= 0 && quietTime <= 10) 
			this.quietTime = quietTime;
		if (music >= 0 && music <= 10)
			this.music = music;
		if (reading >= 0 && reading <= 10)
			this.reading = reading;
		if (chatting >= 0 && chatting <=10)
			this.chatting = chatting;
		
	}
	
	public int getQuietTime() {
		return quietTime;
	}
	public int getMusic() {
		return music;
	}
	public int getReading() {
		return reading;
	}
	public int getChatting() {
		return chatting;
	}
	
	public int compare(Preference pref) {
		int a = (this.getQuietTime() - pref.getQuietTime());
		int b = (this.getMusic() - pref.getMusic());
		int c = (this.getReading() - pref.getReading());
		int d = (this.getChatting() - pref.getChatting());
		
		return (a+b+c+d);
	}

}
