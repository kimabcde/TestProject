package com.mytest.test02;

public class Radio implements Volume{
	int VolLevel;
	
	
	Radio(){}
	
	
//	Radio(int volLevel) {
//		super();
//		VolLevel = volLevel;
//	}

	
	@Override
	public void volumeUp(int level) {
		VolLevel+=level;
		System.out.println("Radio볼륨 올립니다."+VolLevel);
	}
	
	@Override
	public void volumeDown(int level) {
		VolLevel-=level;
		System.out.println("Radio볼륨 내립니다."+VolLevel);
	}
	
}
