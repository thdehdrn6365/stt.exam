package com.song.exam.tv;

public class LgTv extends Tv {
	public String model = "LG";

	public LgTv() {
	}

	public LgTv(String str) {
		model = str;
	}

	public void record() {
		System.out.println("녹화를 하고 있습니다.");
	}

	@Override
	public String toString() {
		return "LGTV!!";
	}
    @Override 
	public void ShowState() {
		System.out.printf("!");
	}
}
