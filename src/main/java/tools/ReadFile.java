package tools;

import java.io.*;

public class ReadFile {
    public ReadFile() {
    }

    //public String read(){
    public static int count(String path) {
        File file = new File(path);
        StringBuffer buffer = new StringBuffer();
        InputStream is;
        int count = 0;
        int temp =0;
        try {
            is = new FileInputStream(file);
            String line;
            BufferedReader reader = new BufferedReader(new InputStreamReader(is,"GBK"));
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
                count++;
                temp++;
                if(count == 5){
                    System.out.println(buffer.toString());
                    buffer = new StringBuffer();
                    count = 0;
                }
            }
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return buffer.toString();
        return temp;
    }

    public static String read(String path) {
        File file = new File(path);
        StringBuffer buffer = new StringBuffer();
        InputStream is;
        try {
            String line;
            is = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
