package com.annotation.testing;

/**
 * The Class CreateObject.
 */
public class CreateObject {

	/** The obj. */
	private String obj;

	/**
	 * Gets the obj.
	 *
	 * @return the obj
	 */
	public String getObj() {
		return obj;
	}

	/**
	 * Sets the obj.
	 *
	 * @param obj the new obj
	 */
	public void setObj(String obj) {
		this.obj = obj;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CreateObject [obj=" + obj + ", getObj()=" + getObj() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
