package org.dinesh;

import java.io.File;

public class fileOpertion {
	public static void main(String[] args) {
	
	  File f = new File("E:\\dinesh\\new");
	  boolean mkdir = f.mkdir();
	  System.out.println(mkdir);
		
	  File f1 = new File("E:\\dinesh1");
	  boolean delete = f1.delete();
	  System.out.println( delete );
		
		File f2 = new File("E:\\dinesh");
		boolean is = f2.isDirectory();
		System.out.println( is );
		
		File f3 = new File("E:\\dinesh");
		boolean i = f3.isHidden();
		System.out.println( i );
		
		File f4 = new File("E:\\dinesh");
		boolean s = f4.exists();
		System.out.println( s );
		
		File f5 = new File("E:\\");
		File[] F = f5.listFiles();
		for (File x : F) {
		System.out.println( x );
		
		
		
		
	    
		}
			
}
}
