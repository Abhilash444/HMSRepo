package test;

import java.util.Properties;

public class Test {
	public static void main(String[] args) {
		/*
		 * Properties p = System.getProperties(); p.setProperty("pirate","scurvy");
		 * String s = p.getProperty("argProp") + " "; s += p.getProperty("pirate");
		 * System.out.println(s);
		 */
	
		/* try { 
			              System.out.println(doStuff(args)); 
			          } 
			          catch (Exception e) { System.out.println("exc"); } 
			          doStuff(args); 
			      }
			      static int doStuff(String[] args) { 
			          return Integer.parseInt(args[0]); 
			      }*/
	
		try {
            int x = 0;
            for (x=1; x<4; x++); 
            System.out.println(x);
        } catch(Exception e) {}
        finally {
            System.out.println("Error");
        }
	}	
}
