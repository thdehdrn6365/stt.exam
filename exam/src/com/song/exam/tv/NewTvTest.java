package com.song.exam.tv;

public class NewTvTest {
	public static void main(String[] args) {
		LgTv lgtv=new LgTv();
		LgTv lgtv2=new LgTv();
		//lgtv lgtv3=new lgtv();
		
		lgtv.ShowState();
		lgtv.setChannel(500);
		lgtv.record();
		
		
		
		
		SamsungTv samsung=new SamsungTv();
		System.out.println(lgtv2.toString());
		System.out.println(samsung.toString());
		
		//samsung.channelup();
	}

}
