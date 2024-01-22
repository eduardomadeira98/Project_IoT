package  core.updateEvents;

import com.bezirk.middleware.messages.Event;

public class HelpEventUpdate extends Event {
	private static final long serialVersionUID = 1L;
	private String currentHour;

    public HelpEventUpdate(String currentHour) {
    	this.currentHour= currentHour;
    }

    public String getCurrentHour() {
		return currentHour;
	}
}
