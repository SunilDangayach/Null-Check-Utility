package com.annotation.testing;

/**
 * The Class AnnotationTestingClass.
 */
public class AnnotationTestingClass {

	/** The one. */
	@Test(message="one message")
	private String one;
	
	/** The two. */
	@Test(message="two message")
	private String two;

	/** The three. */
	private String three;
	
	@Test(message="annotation2 cannot null")
	/** The test class2. */
	private AnnotationTestClass2 testClass2;
	
	/**
	 * Gets the one.
	 *
	 * @return the one
	 */
	public String getOne() {
		return one;
	}

	/**
	 * Sets the one.
	 *
	 * @param one the new one
	 */
	public void setOne(String one) {
		this.one = one;
	}

	/**
	 * Gets the two.
	 *
	 * @return the two
	 */
	public String getTwo() {
		return two;
	}

	/**
	 * Sets the two.
	 *
	 * @param two the new two
	 */
	public void setTwo(String two) {
		this.two = two;
	}

	/**
	 * Gets the three.
	 *
	 * @return the three
	 */
	public String getThree() {
		return three;
	}

	/**
	 * Sets the three.
	 *
	 * @param three the new three
	 */
	public void setThree(String three) {
		this.three = three;
	}

	/**
	 * Gets the test class2.
	 *
	 * @return the test class2
	 */
	public AnnotationTestClass2 getTestClass2() {
		return testClass2;
	}

	/**
	 * Sets the test class2.
	 *
	 * @param testClass2 the new test class2
	 */
	public void setTestClass2(AnnotationTestClass2 testClass2) {
		this.testClass2 = testClass2;
	}
	
	
	
}
