package com.syntax.class28;

public abstract class Marks {
	
	public abstract int getPercentage();
	
	
	int math;
	int geo;
	int chem;
	
	Marks(int math, int geo, int chem){
		
	}
}

	class A extends Marks{
		
		A (int math, int geo, int chem){
			
			super(math, geo, chem);
		}
	
		public int getPercentage() {
			
			int result = 0;
			return result;
		
	}
}
	class B extends Marks {
		
		int science;
		
		B(int math, int geo, int chem, int science){
			super(math, geo, chem);
			this.science = science;
			
		}
		
		public int getPercentage() {
			
			int result = (math+geo+chem+science)/4;
			return result;
		}
	}
	




