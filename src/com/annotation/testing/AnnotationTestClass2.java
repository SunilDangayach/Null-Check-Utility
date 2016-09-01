package com.annotation.testing;

/**
 * The Class AnnotationTestClass2.
 */
public class AnnotationTestClass2 {
	
	/** The four. */
	private String four;
	
	
	/** The five. */
	@Test(message="five message")
	private String five;
	
	@Test(message="annotation 3 Cannot null")
	private AnnotationTestClass3 testClass3;
	
	
	
	

	/**
	 * Gets the test class3.
	 *
	 * @return the test class3
	 */
	public AnnotationTestClass3 getTestClass3() {
		return testClass3;
	}

	/**
	 * Sets the test class3.
	 *
	 * @param testClass3 the new test class3
	 */
	public void setTestClass3(AnnotationTestClass3 testClass3) {
		this.testClass3 = testClass3;
	}

	/**
	 * Gets the four.
	 *
	 * @return the four
	 */
	public String getFour() {
		return four;
	}

	/**
	 * Sets the four.
	 *
	 * @param four the new four
	 */
	public void setFour(String four) {
		this.four = four;
	}

	/**
	 * Gets the five.
	 *
	 * @return the five
	 */
	public String getFive() {
		return five;
	}

	/**
	 * Sets the five.
	 *
	 * @param five the new five
	 */
	public void setFive(String five) {
		this.five = five;
	}
	
	

}
