package com.java.exception;

/**
 * When you compile the above program, two .class files will be generated. One
 * is A.class and another one is B.class. If you remove the A.class file and run
 * the B.class file, Java Runtime System will throw NoClassDefFoundError
 */
public class NoClassDefFoundErrorEx {
	public static void main(String[] args)
    {
        A a = new A();
    }
}
class A
{
  // some code
}

/*Exception in thread "main" java.lang.NoClassDefFoundError: com/java/exception/A
at com.java.exception.NoClassDefFoundErrorEx.main(NoClassDefFoundErrorEx.java:11)
Caused by: java.lang.ClassNotFoundException: com.java.exception.A
at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:338)
at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
... 1 more
*/