package way2smstestng1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {
	
	public void show()throws IOException
	{
	System.out.println("i am in main");
	}
}
class FileReader extends Reader
{
	public void show()throws FileNotFoundException
	{
		System.out.println("i am in center");
	}
}