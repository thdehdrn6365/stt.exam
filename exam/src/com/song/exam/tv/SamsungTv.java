package com.song.exam.tv;

public class SamsungTv extends Tv{
	
  void channelup() {
	  
	  setChannel(channel+5);
  }

@Override
public String toString() {
return String.format("%s의 채널:%d, 볼륨:%d","삼성",channel,vol);	
}

@Override 
public void ShowState() {
	System.out.printf("!");
}

}

