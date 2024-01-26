package com.kn.string.reverse;

public static class StringReverese {
	
	public static StringReverese(String inpuitString) {
		
	char[] crr=inputString.toCharArray();
	
	StringBuffer stringBuffer=new StringBuffer();
	
	for(int i=crr.length-1;i>0;i--) {
		stringBuffer.append(crr[i]);
	}
	
	return new String(StringBuffer);
	
	
	}

}
