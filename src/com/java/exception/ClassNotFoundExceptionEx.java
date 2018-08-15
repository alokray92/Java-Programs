package com.java.exception;

public class ClassNotFoundExceptionEx {
	public static void main(String[] args) {
		  try
	        {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        }catch (ClassNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	}
}
/*java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:338)
at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:264)
at com.java.exception.ClassNotFoundExceptionEx.main(ClassNotFoundExceptionEx.java:7)
*/