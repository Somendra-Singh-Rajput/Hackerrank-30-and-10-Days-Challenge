package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInterface {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		A1 a = new A1(20,"GeeksForGeeks");
		  
        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
  
        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A1 b = (A1)ois.readObject();//down-casting object
  
        System.out.println(b.i+" "+b.s);
  
        // closing streams
        oos.close();
        ois.close();
	}

}

class A1 implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
    String s;
  
    // A class constructor
    public A1(int i,String s)
    {
        this.i = i;
        this.s = s;
    }
}