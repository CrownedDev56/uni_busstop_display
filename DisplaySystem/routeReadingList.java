package DisplaySystem;

import java.io.*;

public class routeReadingList {
	public static void main(String[] args) throws IOException {
		RouteParser r = new RouteParser();
		r.openFile();
		r.readFile();
		r.closeFile();
	

		}
	}

