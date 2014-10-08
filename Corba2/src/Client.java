import java.util.Scanner;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.ORBPackage.InvalidName;



public class  Client{

public static void main(String args[])
{
    java.util.Properties props = System.getProperties();
    

    int status = 0;
    org.omg.CORBA.ORB orb = null;

try
    {
    orb = ORB.init(args, props);
    run(orb);
    }
catch(Exception ex)
    {
    ex.printStackTrace();
    status = 1;
    }

if(orb != null)
{
    try
    {
    orb.destroy();
    }
    catch(Exception ex)
    {
    ex.printStackTrace();
    status = 1;
    }
}

System.exit(status);
}

static void run(ORB orb)
{
    org.omg.CORBA.Object obj = null;
	
	try
	{
	
	obj=orb.resolve_initial_references("NameService");
	}
	catch(InvalidName e)
	{
		e.printStackTrace();
		System.exit(1);
	}
	
	
	NamingContext ctx = NamingContextHelper.narrow(obj);
	
	
	if (ctx==null)
	{
		System.out.println("Le composant NameService n'est pas un repertoire");
		System.exit(1);
	}
	
	NameComponent[] name = new NameComponent[1];
	
	name[0]=new NameComponent("ChatService","");
	
	try
	{
	obj = ctx.resolve(name);
	}
	catch (Exception e)
	{
		System.out.println("Composant inconnu");
		e.printStackTrace();
		System.exit(1);
	}
	
  /*
    String refFile = "Hello.ref";
    java.io.BufferedReader in = new java.io.BufferedReader(
    new java.io.FileReader(refFile));
    String ref = in.readLine();
    System.out.println("IOR :"+ref);
    obj = orb.string_to_object(ref);
    //obj = orb.string_to_object("relfile:/Hello.ref");*/

Chat chat = ChatHelper.narrow(obj);



	Scanner input = new Scanner(System.in);
	System.out.print("login ? : ");
	String login = input.nextLine();
	chat.connect(login);
	
	
	
	while (true){
		
	
		System.out.println("Message ? : ");
		String newMessage= input.nextLine();
		
	
		for (String client : chat.getClients()){
			
			chat.sendMessage(login, client, newMessage);			
			System.out.println(chat.getMessage(client));
		}
		
	}
}
	
	/*
	while(true)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("login ? : ");
		String login = input.nextLine();
		chat.connect(login);
		
		if(login.equals("Zoubir"))
		{
			//System.out.print("message? : ");
			//String message = input.nextLine();
			String message=chat.getMessage("Zoubir");
			System.out.println("Toto a dit :" + message);
		}
		else
		{
			System.out.print("message? : ");
			String message = input.nextLine();
			chat.sendMessage("Toto", "Zoubir", message);
		}
		*/

}




