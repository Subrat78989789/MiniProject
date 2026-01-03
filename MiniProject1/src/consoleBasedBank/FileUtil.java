package consoleBasedBank;

import java.io.File;
import java.io.FileWriter;

public class FileUtil {
	
	public static void writeAccountdetails(Account ac)throws Exception
	{
		File f=new File("Bank.txt");
		f.createNewFile();
		FileWriter fWriter=new FileWriter(f,true);
		if(f.canWrite())
		{
			fWriter.write(ac.holderName+" | "+ac.accNo+" | "+ac.balance+" | "+ac.caller+"\n");
		}
		fWriter.close();
		
		
	}

}
