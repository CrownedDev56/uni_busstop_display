package DisplaySystem;


public class expectedBus {

	public int routeID;
	public int journeyNo;
	public String destination;
	//public time
	public int delay;
	
	
	public void RouteID(int routeID) {
		this.routeID = routeID;
	}
	public int getRouteID(){
		return routeID;
	}
	
	
	public void setjourneyNo(int journeyNo) {
		this.journeyNo = journeyNo;
	}
	public int getjourneyNo(){
		return journeyNo;
	}
	
	
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public int getDelay(){
		return delay;
	}
	
	
	enum busStatus {
	cancelled,
	delayed,
	onTime
	}
}
