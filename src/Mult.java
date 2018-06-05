public class Mult {
  public static void main(String[] args) {
    try {
    mult("1121", "126");
    }
    catch(Exception e) {
    	System.out.println("Некоректне введення даних");
    }
    }
  
  public static String mult(String n1, String n2) {
    int[] mas1 = new int[2];
    int[] mas2 = new int[3];
    int digit;
    int step;
    String result = "";
        
      
      for(int i=0; i<1; i++) {
        if(n1.length() > n2.length()) {
          mas1[i] = Integer.parseInt(n1);
          mas1[i+1] = Integer.parseInt(n2);  
        }else {
          mas1[i+1] = Integer.parseInt(n1);
          mas1[i] = Integer.parseInt(n2);  
        }
        
         
        System.out.println("           " + mas1[i]);
        System.out.println("           " + mas1[i+1]);
      }
      
      
      System.out.println("       -----------");
      
   
      int k = 0;
      
      
      switch(k) {
      case 0:
         digit = mas1[1] % 10;
         step = mas1[0] * digit;
         mas2[k] = step;  
         if(mas2[k] != 0) {
             System.out.println("           " + mas2[k]);
         }
         k++;
    
         
      case 1:    
         digit = (mas1[1] % 100) - (mas1[1] % 10);
         step = mas1[0] * digit;
         mas2[k] = step;
         if(mas2[k] != 0) {
         System.out.println("          " + mas2[k]);
         }
         k++;
         
         
      case 2: 
         digit = (mas1[1] % 1000) - (((mas1[1] % 100) - (mas1[1] % 10)) + (mas1[1] % 10) );
         step = mas1[0] * digit;
         mas2[k] = step;
         if(mas2[k] != 0) {
         System.out.println("         " + mas2[k]);
         }
         k++;
         break;
     }
      
      
      int d = 0;
      if(k==3) {
        for(int i=0; i<k; i++) {
          d = d + mas2[i];
          result = "" + d;
           }
         }
       
  
       System.out.println("       -----------");
       System.out.println("Результат: " + result);
       

       return result;
       
       
    }
  
   
  }
