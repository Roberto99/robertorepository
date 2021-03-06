
/**
* ChatPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Chat.idl
* mardi 14 octobre 2014 14 h 54 CEST
*/

public abstract class ChatPOA extends org.omg.PortableServer.Servant
 implements ChatOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect", new java.lang.Integer (0));
    _methods.put ("disconnect", new java.lang.Integer (1));
    _methods.put ("getClients", new java.lang.Integer (2));
    _methods.put ("sendMessage", new java.lang.Integer (3));
    _methods.put ("getMessage", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Chat/connect
       {
         String pseudo = in.read_string ();
         this.connect (pseudo);
         out = $rh.createReply();
         break;
       }

       case 1:  // Chat/disconnect
       {
         String pseudo = in.read_string ();
         this.disconnect (pseudo);
         out = $rh.createReply();
         break;
       }

       case 2:  // Chat/getClients
       {
         String $result[] = null;
         $result = this.getClients ();
         out = $rh.createReply();
         ClientsHelper.write (out, $result);
         break;
       }

       case 3:  // Chat/sendMessage
       {
         String from = in.read_string ();
         String to = in.read_string ();
         String message = in.read_string ();
         this.sendMessage (from, to, message);
         out = $rh.createReply();
         break;
       }

       case 4:  // Chat/getMessage
       {
         String pseudo = in.read_string ();
         String $result = null;
         $result = this.getMessage (pseudo);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Chat:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Chat _this() 
  {
    return ChatHelper.narrow(
    super._this_object());
  }

  public Chat _this(org.omg.CORBA.ORB orb) 
  {
    return ChatHelper.narrow(
    super._this_object(orb));
  }


} // class ChatPOA
