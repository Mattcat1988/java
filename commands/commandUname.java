
package commands;
import java.io.*;



public class commandUname {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("/usr/bin/uname", "-a");
        Process process = processBuilder.start();
//        int exitCode = process.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Версия ядра: " + line);

            
        }
//        process.waitFor();
    }

}
