/**
 * Created by cletus on 5/31/17.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class digTool {
    public void dig(String cmd){
        String s = null;
        //System.out.println("\n=========== Executing command: " + cmd + " ===========");

        try {
            Process p = Runtime.getRuntime().exec(cmd);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            // read the output from the command
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            // read any errors from the attempted command
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

        }catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
        }
    }

}
