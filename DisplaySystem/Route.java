package DisplaySystem;

import java.util.ArrayList;
import java.util.List;

public class Route {
	public Route(String routeID, String endD, String startD) {
		this.routeID = routeID;
		this.endD = endD;
		this.startD = startD;
		this.allRoutes = new ArrayList<Route>();
		
	}
	
	public String routeID, endD, startD;
	//public TIME schedule;
	List<Route> allRoutes ;
	

	
	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}
	public String getRouteID(){
		return routeID;
	}

	public void setStartD(String startD) {
		this.startD = startD;
	}
	public String getStartD() {
		return startD;
	}
	
	public void addRoute(Route r) {
		allRoutes.add(r);
	}

	public void setendD(String endD) {
		this.endD = endD;
	}

	public String getEndD() {
		return endD;
	}
	
	
	public String RouteInfo() {
		String result = allRoutes.get(0).getStartD();
		
		for (int i = 1; i < allRoutes.size(); i++) {
			result += ", " + allRoutes.get(i).getStartD();
		}
		result += ". " + routeID + ". " + startD + ". " + endD;
		return result;
	}
	
	
	
	
	
}
