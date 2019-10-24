package com.song.exam.tv;

public class TvTest3 {
	public static void main(String[] args) {
		
		LgTv tv1=new LgTv("XE-123");
		LgTv tv2=new LgTv("DD-DM");
		LgTv tv3=new LgTv("BGH-HJK");
		
		System.out.println(tv1.model);
		System.out.println(tv2.model);
		System.out.println(tv3.model);
	
		Tv  tv=tv1;
		
	}

}
