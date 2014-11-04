import java.util.ArrayList;




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
		System.out.println(pseudo + "s'est déconnecté");
		// TODO Auto-generated method stub

	}

	@Override
	public String[] getClients() {
		// TODO Auto-generated method stub
		
		String[] clientTableau = new String[listeClients.size()];
		clientTableau=listeClients.toArray(clientTableau);
		return clientTableau;
	
	}

	@Override
	public void sendMessage(String from, String to, String message) {
		// TODO Auto-generated method stub
		//this.message=message;
		messages.add(message);
		for (String mess : messages){
		System.out.println("methode du serveur : " + mess);
		}
	}

	@Override
	public String getMessage (String pseudo) {
		// TODO Auto-generated method stub
	
		
		if (messages.size()>=2) {
			return messages.get(messages.size()-2);
		}
		else {
				return "";
			 }
		
		
		
	}

}
