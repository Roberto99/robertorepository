
public class ChatImpl extends ChatPOA {
	
	String message;
	String[] listeClients = new String [100];

	@Override
	public void connect(String pseudo) {
		// TODO Auto-generated method stub
		System.out.println( pseudo + " s'est connect�");	
		
			int i =0;
			
			for (i=0; i<listeClients.length; i++){
			//	System.out.println("cr�ation de la boucle for");
				
				if (listeClients[i]==null) {
				//	System.out.println("test if");
					System.out.println("i :" + i);
					listeClients [i]=pseudo;
					System.out.println ("valeur de la premi�re case du tablea" + listeClients[0]);
					
				}
				
			//System.out.println("Num�ro du client + " +i+ ":" + listeClients[i]);
			}
		
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

	/*public void setClients(String client){
		
		
		
		for (int i=0;i<listeClients.length;i++){
		listeClients [i]=client;
		System.out.println("Num�ro du client + " +i+ ":" + listeClients[i]);
		}
		
	}*/
	
	
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
