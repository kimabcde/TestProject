package com.mytest.test02;

public class TV implements Volume{

	int VolLevel;
	
	
	TV(){}
	
	
//	TV(int volLevel) {
//		super();
//		VolLevel = volLevel;
//	}

	
	@Override
	public void volumeUp(int level) {
		VolLevel+=level;
		System.out.println("TV볼륨 올립니다."+VolLevel);
	}
	
	@Override
	public void volumeDown(int level) {
		VolLevel-=level;
		if(VolLevel<0)
			VolLevel = 0;
		System.out.println("TV볼륨 내립니다."+VolLevel);
	}
}
