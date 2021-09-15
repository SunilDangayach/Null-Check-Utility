### Background
This is an annotation driven utility to check if variable value is null or not inside the given object.

It performs the nested level check.

Only annotated variables will be analyzed at the run time.

### Example
```
    package com.annotation.testing;  
  
    /**  
    * The Class AnnotationTestClass3.  
    */  
    public class AnnotationTestClass3 {  
  
       /** The six. */  
        @Test(message="six message")  
        private String six;  
  
        /** The seven. */  
        private String seven;  
  
        /**  
        * Gets the six.  
        *  
        * @return the six  
        */  
        public String getSix() {  
            return six;  
        }  
  
        /**  
        * Sets the six.  
        *  
        * @param six the new six  
        */  
        public void setSix(String six) {  
            this.six = six;  
        }  
  
        /**  
        * Gets the seven.  
        *  
        * @return the seven  
        */  
        public String getSeven() {  
            return seven;  
        }  
  
        /**  
        * Sets the seven.  
        *  
        * @param seven the new seven  
        */  
        public void setSeven(String seven) {  
            this.seven = seven;  
        }  
    }
``` 
Here null check utility processor will going to check only variable six.

### Purpose
1. Perfrom null check during run time.
2. If any variable inside the object is null/not Null then perform the required actions.

### Technologies
-   Java
-   Reflection
-   Annotation

