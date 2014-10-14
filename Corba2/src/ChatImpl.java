import java.util.ArrayList;

//commentaire


public class ChatImpl extends ChatPOA {
	
	ArrayList <String> messages = new ArrayList <String>();

	ArrayList <String> listeClients = new ArrayList<String>();

	

	@Override
	public void connect(String pseudo) {
		// TODO Auto-generated method stub
		
		System.out.println( pseudo + " s'est connecté");	
		
		listeClients.add(pseudo);
				
			}
		
	

	@Override
	public void disconnect(String pseudo) {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] getClients() {
		// TODO Auto-generated method stub
		
		String[] clientTableau = new String[listeClients.size()];
		clientTableau=listeClients.toArray(clientTableau);
		return clientTableau;
	}




	/*public void setClients(String client){
		
		
		
		for (int i=0;i<listeClients.length;i++){
		listeClients [i]=client;
		System.out.println("Numéro du client + " +i+ ":" + listeClients[i]);
		}
		
	}*/

	
	
	@Override
	public void sendMessage(String from, String to, String message) {
		// TODO Auto-generated method stub
		//this.message=message;
		messages.add(message);
	}

	@Override
	public String getMessage (String pseudo) {
		// TODO Auto-generated method stub
		//String msg = messages.remove(messages.size()-1);
		//messages.add(msg);
		
		if (messages.size()>=2) {
			return messages.get(messages.size()-2);
		}
		else {
				return "message par défaut";
			 }
	}

}
