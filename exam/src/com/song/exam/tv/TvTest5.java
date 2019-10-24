package com.song.exam.tv;

public class TvTest5 {

	public static void main(String[] args) {
		SamsungTv sstv=new SamsungTv();
		LgTv lgtv=new LgTv();
		
		mainShowState(sstv);
		mainShowState(lgtv);

	}
	public static void mainShowState(Tv tv) {
		tv.ShowState();
		
		
	}
	
}
