
public class Armstrong2 {

	public static void main(String[] args)
	{
	 for (int k = 100 ; k <= 1000 ; k++) 
         { 
                    int number = k; 
                    int d = 0; 
                    int sum = 0;

                    while (number > 0) 
                     { 
                                 d = number % 10; 
                                 sum = sum + (d * d * d); 
                                 number = number / 10; 
                     } 
                     if (k == sum) 
                      { 
                                 System.out.println ("armstron number"+k); 
                       } 
          } 
}
}