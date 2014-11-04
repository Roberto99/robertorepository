import org.omg.CosNaming.NameComponent;


public class Connection_Impl extends ConnectionPOA{

	@Override
	public Dialogue connect(String nickname) {
		// TODO Auto-generated method stub
		
		System.out.println(nickname + "s'est connecté");
		
		return null;
	}

}
