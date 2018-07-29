package com.test;

public class SingleToneClass {
	private static SingleToneClass singleToneClass;
	private SingleToneClass(){
	}
	  public  static SingleToneClass getInstance(){
		if(singleToneClass == null){
			synchronized (SingleToneClass.class){  // for Thread Safe
				singleToneClass = new SingleToneClass();
			}
		}
		return singleToneClass;
	}
	  protected Object readResolve(){ // fix duplicate object issue while serialization
		  return singleToneClass;
	  }
	  
	@Override
	protected Object clone() throws CloneNotSupportedException { // fix cloning issue 
		// TODO Auto-generated method stub
		return singleToneClass;
	}
}
