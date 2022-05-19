
public class Menu {
	
	public static void main(String[]args)
	{
	String[]list= {"Rosemary Chicken","Beef Wellington", "Maine Lobster"};
    
	  public displaymenu();
	{
		System.out.println("Type your selection, then press [Enter].");
		for(int x=0; x< list.length; x++){
			System.out.println("type " +(x + 1 ) + " for " + list[x]);
		}
			}
	public String getselection (int x){
		return(list[x-1]);
	}
}
}