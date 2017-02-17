import java.io.*;

public class DiskEater{

    public DiskEater(){
	String currentDir = System.getProperty("user.dir");
	System.out.println(currentDir);
	//File drive = new File(currentDir.replace());
	File drive = new File("/students/r56h822");
	Writer writer = new BufferedWriter();
	try {
	    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt"), "utf-8"));
		
	    while(drive.getUsableSpace() / drive.getTotalSpace() > 0.1){
		writer.write("1");		
	    }
	}catch(Exception e){
	    System.out.println(e.getMessage());
	}
	writer.close();
    }
    public static void main(String[] asdf){
	DiskEater de = new DiskEater();
    }
}
