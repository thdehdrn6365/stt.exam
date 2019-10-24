package com.song.exam.tv;

public class Tv {
	protected int channel;
	protected int vol;
	protected  String model;
	
	
	
	Tv(){}
	Tv(int channel,int vol){
		
		this.channel=channel;
		setChannel(channel);
		setVol(vol);
		this.vol=vol;
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>300)
		{
			this.channel=300;
		}
		else if(channel<1)
		{
			this.channel=1;
		}
		else
		this.channel = channel;
	}
	
	public int getVol() {
		return vol;
	}
	
	public void setVol(int vol) {
			if(vol<0)
				this.vol=0;
		if(vol>20)
		{   this.vol=20;
		    System.out.printf("Volum은 20을 넘을수 없습니다\n");
			//System.out.printf("%d",vol);
		}
		else
		this.vol = vol;
	}
		
	void ShowState() {
		System.out.printf("channel:%d  volume: %d\n ",channel,vol);
	}
	void channelup() {
		channel++;
	} 
	void channelDown(){
		channel--;
	}
	
	void VolDown(){
		vol++;
	}
	
	void VolUP(){
		
		vol++;
	}

	
}


