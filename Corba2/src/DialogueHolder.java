
/**
* DialogueHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Chat.idl
* mardi 14 octobre 2014 15 h 47 CEST
*/

public final class DialogueHolder implements org.omg.CORBA.portable.Streamable
{
  public Dialogue value = null;

  public DialogueHolder ()
  {
  }

  public DialogueHolder (Dialogue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DialogueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DialogueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DialogueHelper.type ();
  }

}
