package  core.updateEvents;

import com.bezirk.middleware.messages.Event;

public class CampainhaDePortaEventUpdate extends Event{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currentHour;

	public CampainhaDePortaEventUpdate() {
		 
	}

	public CampainhaDePortaEventUpdate(String currentHour) {
		this.currentHour= currentHour;
	}
	
	public String getCurrentHour() {
		return currentHour;
	}
	

}
