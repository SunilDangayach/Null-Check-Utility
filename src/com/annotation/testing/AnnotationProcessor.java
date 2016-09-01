package com.annotation.testing;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * The Class AnnotationProcessor.
 *
 */
public class AnnotationProcessor {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InstantiationException the instantiation exception
	 * @throws IllegalAccessException the illegal access exception
	 */
	public static void main(String ...args) throws InstantiationException, IllegalAccessException{
		
		AnnotationTestingClass annotationTestinClass = new AnnotationTestingClass();
		annotationTestinClass.setOne(null);
		annotationTestinClass.setTwo("");
		annotationTestinClass.setThree("");
		
		AnnotationTestClass2 annotationTestClass2 = new AnnotationTestClass2();
		annotationTestClass2.setFive("5");
		annotationTestClass2.setFour("4");
		
		annotationTestinClass.setTestClass2(annotationTestClass2);
		
		AnnotationTestClass3 testClass3 = new AnnotationTestClass3();
		testClass3.setSeven("7");
		testClass3.setSix("6");
		
		annotationTestClass2.setTestClass3(null);
		
		/*String test = null;
		Objects.requireNonNull(test,"can't be null");
		*/
		Class<?> annotationClass = annotationTestinClass.getClass();
		Field[] decalaredFieldsArray = annotationClass.getDeclaredFields();
		List<String> lstString = new ArrayList<>();

		parseFields(decalaredFieldsArray,annotationTestinClass,lstString);
		
		System.out.println(lstString);
		
		CreateObject createObj = (CreateObject) createObjReflection(CreateObject.class,"123");
		System.out.println(createObj.getObj());
	}
	
	/**
	 * Creates the obj reflection.
	 *
	 * @param createObj the create obj
	 * @param value the value
	 * @return the object
	 * @throws InstantiationException the instantiation exception
	 * @throws IllegalAccessException the illegal access exception
	 */
	public static Object createObjReflection(Class<?> createObj,String value) throws InstantiationException, IllegalAccessException{
		Object obj = createObj.newInstance();
		Arrays.stream(createObj.getDeclaredFields()).forEach(field->{
			field.setAccessible(true);
			try {
				if(field.getType().getName().equals("java.lang.String")){
					field.set(obj,value);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		
		return obj;
		
	}

	/**
	 * Parses the fields.
	 *
	 * @param decalaredFieldsArray the decalared fields array
	 * @param obj the obj
	 * @param lstString the lst string
	 * @return the list
	 */
	public static List<String> parseFields(Field[] decalaredFieldsArray,Object obj,List<String> lstString){
		
		Arrays.stream(decalaredFieldsArray).forEach(field ->{
			field.setAccessible(true);
			Test test = field.getDeclaredAnnotation(Test.class);
			if(field.getType().isPrimitive() || field.getType().getName().equals("java.lang.String")){
	            if(field.isAnnotationPresent(Test.class)){
					try {
						System.out.println("field value is :"+field.get(obj));
						System.out.println("field Name is :"+field.getName());
						if(field.get(obj)== null || !StringUtils.isNoneBlank(field.get(obj).toString())){
							lstString.add(test.message());
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					}
	            }
			}else{
				Field[] objectFields =null;
				Object objValue = null;
				try {
					if(field.isAnnotationPresent(Test.class)){
						objValue = field.get(obj);
						if(objValue!=null){
							objectFields = objValue.getClass().getDeclaredFields();
							parseFields(objectFields, objValue, lstString);
						}else{
							System.out.println("Object value is -"+field.get(obj));
							System.out.println("Messsage value is -"+test.message());
							lstString.add(test.message());
						}
					}

				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
			
		});
		return lstString;
	}
	
}