import java.util.*;

public class ArrayListTarga {
	
	public static void main (String[] args) 
	{
		Scanner in= new Scanner(System.in);
		ArrayList<Targa> provatarghe= new ArrayList();
		System.out.println("S?");
		int targhe=Integer.parseInt(in.nextLine());
		for (int i=0; i<targhe; i++)
		{
			System.out.println("Inserisci la targa");
			provatarghe.add(new Targa(in.nextLine()));
		}
		
		for (int k=0; k<provatarghe.size();k++)
		{
			System.out.println(provatarghe.get(k).toString());
		}
	}
}

