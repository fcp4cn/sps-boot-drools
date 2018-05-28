package sps;

import java.util.HashMap;
import java.util.Map;

//MapReduce thoughts
public class SPSfact implements java.io.Serializable {
	private static final long serialVersionUID = 463517327003502569L;

	private Map<String, Object> args;//in parameters
	
	private int status;
	private String message;
	private Map<String, Object> mapData;//TEMP data 
	
	private Map<String, Object> reduceOut;//for data out

	public SPSfact() {
		args = new HashMap<String, Object>();
		
		status = 0;
		message = null;//ready now
		mapData = new HashMap<String, Object>();
		reduceOut = new HashMap<String, Object>();
	}
	
	public Map<String, Object> getArgs() {
		return args;
	}

	public void setArgs(Map<String, Object> args) {
		this.args = args;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, Object> mapData) {
		this.mapData = mapData;
	}

	public Map<String, Object> getReduceOut() {
		return reduceOut;
	}

	public void setReduceOut(Map<String, Object> reduceOut) {
		this.reduceOut = reduceOut;
	}

}
