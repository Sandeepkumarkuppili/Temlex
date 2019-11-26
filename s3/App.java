
import java.util.Scanner;


public class App {
	 
	
	public static void main( String[] args )
	    {
	        DataService dataService = new DataService();
	        System.out.println( "Number of terms : " + dataService.CreateConnection());
	        Scanner sc=new Scanner(System.in);
	        String term=sc.nextLine();
	        dataService.saveTerm(term);
	    }

}
