import java.util.*;

public class chatbot {

	Map<String,String>nouns = new HashMap<String, String>();
	boolean exit=false;
	
	public chatbot()
	{
		nouns.put("money", "Where??");
		nouns.put("finance", "Many firms provide loan options");
		nouns.put("invest", "Yes,Offcourse.Basically there are many options to invest.Regional Or Investment Banks In which section would you like to invest?");
		nouns.put("bank", "Yes,Offcourse.Basically there are many options to invest.Regional Or Investment Banks In which section would you like to invest?");
		nouns.put("shares", "Which company Shares?");
		nouns.put("loan", "Which loan?? Housing ,Personal,Educational.I recommend to visit SBI banks for this");
		nouns.put("investment","Well there are many such as UBS,Barclays,Deutsche bank,HSBC,Wells Fargo");
		nouns.put("regional", "There are many SBI,IDBI,KotaK Mahindra \n SBI offers 10% etc");
		
		
		nouns.put("hii","Welcome! How can I help you??");
		nouns.put("hey","hey,how I can help you??");
		nouns.put("hello","hello,How can I help you??");
		nouns.put("Thank U", "Welcome");
		
		nouns.put("bye","bye");
		nouns.put("bbye","bbye");
	}
	public static void main(String[] args) {
		chatbot ch = new chatbot();
		Scanner obj = new Scanner(System.in);
		while(true)
		{
			String input = obj.nextLine();
			String output = ch.giveans(input);
			System.out.println(output);
			
			/*if(ch.exit)
			{
				break;
			}*/
		}
	}
	
	String giveans(String input)
	{
		String tokens[] = input.split("\\s");
		
		for(int i=0;i<tokens.length;i++)
		{
			if(nouns.containsKey(tokens[i]))
			{
				return nouns.get(tokens[i]);
			}		
		}
		return ("I am sorry!!");
	}
	
}
