package javaprogramming;
import java.util.*;
public class actortask20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		String actor=scan.nextLine();
		
		switch(actor)
		{
		case "vijay":
			System.out.println("enter the movie name thupaki,theri,sura");
			String vijay=scan.nextLine();
			switch(vijay)
			{case "thupaki":
				System.out.println("super hit");
				break;
			case "theri":
				System.out.println("hit");
				break;
			case"sura":
				System.out.println("flop");
				break;
				default:
					System.out.println("enter a correct movies" );
					break;
			}
				case"rajini":
					System.out.println("select the movie from enthiran,chandramuki,petai");
					String rajinimovies=scan.nextLine();
				switch(rajinimovies) {
				case "enthiran":
					System.out.println("average");
					break;
				case"chandramuki":
					System.out.println(" hit");
					break;
				case "petai":
					System.out.println("super hit");
					break;
					default:
						System.out.println("enter the correct movies");
						break;
				}
					case "kamal":
						System.out.println("enter the movie from vikkram,anbeshivam,virumandi");
						String kamalmovies=scan.nextLine();
					switch(kamalmovies) {
					case"vikkram":
						System.out.println("super hit");
						break;
					case"anbeshivam":
						System.out.println("average");
						break;
					case"virumandi":
						System.out.println("virumandi");
						break;
						default:
							System.out.println("enter the correct movie");
						
					}
						
						
				
				}
				
					
					
			}
			
		
		
		}
	

			