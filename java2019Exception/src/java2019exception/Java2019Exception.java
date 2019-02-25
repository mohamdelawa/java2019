
package java2019exception;

import java.io.IOException;



public class Java2019Exception {

   
    public static void main(String[] args) {
        //code application logic
        System.out.println("--------------------------------------------\n 1-a :");
        try{
            throw new ExceptionB("ExceptionB");
        }catch(ExceptionA e){
            System.out.println(e.getMessage());
        }
         try{
            throw new ExceptionC("ExceptionC");
        }catch(ExceptionA e){
            System.out.println(e.getMessage());
        }
         System.out.println("------------------------------------------\n 1-b :");
       
          try{
            throw new ExceptionA("ExceptionA");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
           try{
            throw new ExceptionB("ExceptionB");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
            try{
            throw new NullPointerException("NullPointerException");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
             try{
            throw new IOException("IOException");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
             System.out.println("----------------------------------------\n 2 :");
            
             try{
                 someMethod();
             }catch(Exception  e){
                 System.out.println(e.getMessage());
             }
    }
    public static void someMethod() throws Exception{
        someMethod2();
    }
     public static void someMethod2() throws Exception{
        throw new Exception("Error");
    }
    
}
