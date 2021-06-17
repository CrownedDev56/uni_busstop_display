package DisplaySystem;

import java.io.*;
import java.util.*;

public class RouteParser {
	
	private static Scanner x;
	public void openFile() {
		try {
			x = new Scanner(new File("routes.csv"));
			}
		catch (Exception e) {
			System.out.println("could not find file");
			}
		}
	public void readFile() {
		while(x.hasNext()) {
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %S\n", a,b,c);
		}
	}
	public void closeFile() {
		x.close();
	}
}
