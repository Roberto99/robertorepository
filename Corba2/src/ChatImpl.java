
public class ChatImpl extends ChatPOA {
	
	String message;
	String[] listeClients;

	@Override
	public void connect(String pseudo) {
		// TODO Auto-generated method stub
		System.out.println( pseudo + " s'est connecté");
	}

	@Override
	public void disconnect(String pseudo) {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] getClients() {
		// TODO Auto-generated method stub
		return listeClients;
	}

	public void SetClients(String client){
		
		
		
		for (int i=0;i<listeClients.length;i++){
		listeClients [i]=client;}
		
	}
	
	
	@Override
	public void sendMessage(String from, String to, String message) {
		// TODO Auto-generated method stub
		this.message=message;
	}

	@Override
	public String getMessage(String pseudo) {
		// TODO Auto-generated method stub
		return message;
	}

}
