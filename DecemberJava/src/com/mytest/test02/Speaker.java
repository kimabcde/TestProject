package com.mytest.test02;

public class Speaker implements Volume {
	
	int VolLevel;
	
	
	Speaker(){}
	
	
//	Speaker(int volLevel) {
//		super();
//		VolLevel = volLevel;
//	}

	
	@Override
	public void volumeUp(int level) {
		VolLevel+=level;
		if(VolLevel>100) 
			VolLevel = 100;
		System.out.println("Speaker볼륨 올립니다."+VolLevel);
	}
	
	@Override
	public void volumeDown(int level) {
		VolLevel-=level;
		if(VolLevel<0)
			VolLevel = 0;
		System.out.println("Speaker볼륨 내립니다."+VolLevel);
	}
	
}
