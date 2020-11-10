import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Leitor1 {

    //private char separator = File.separatorChar;
    //private String path = "C:\\Users\\bsf\\Desktop\\TESTEVSCODE\\IOApplication";
    private String arquivo1 = "\\teste1.txt";

    public Leitor1() {
    }
    
    // public String getPath() {
    //     return path;
    // }
    // public void setPath(String path) {
    //     this.path = path;
    // }

    public String getArquivo1() {
        return arquivo1;
    }
    public void setArquivo1(String arquivo1) {
        this.arquivo1 = arquivo1;
    }


    public void writerArquivo(String path, String file){
        StringBuilder sb = new StringBuilder();
        sb.append(path.replace('\\', File.separatorChar));
        sb.append(file.replace('\\', File.separatorChar));
        String fullPath = sb.toString();
        
        File f = new File(fullPath);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
            bw.write("Testando escrita de arquivo");
            bw.newLine();
            
        } catch (IOException e) {
            e.getStackTrace();
        }
        
    }
    
}//cllas
