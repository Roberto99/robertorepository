

public class ChatImpl extends ChatPOA {
	
	String message;
	String[] listeClients = new String[100];

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
