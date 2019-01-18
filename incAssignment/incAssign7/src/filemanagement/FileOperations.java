package filemanagement;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileOperations {
    public static void main(String[] args) {
        String fileName=args.length==1?args[0]:null;
        FileReader fileReader=null;
        File file=new File("output.txt");
        FileWriter fileWriter=null;
        if(fileName!=null)
        {
            try {
                fileReader=new FileReader(fileName);
                fileWriter=new FileWriter(file);
                Map<Character,Integer> characterIntegerHashMap=new HashMap<>();
                char fileCharacter;
                int i;
                while((i=fileReader.read())!=-1) {
                    fileCharacter=(char)i;
                    if (characterIntegerHashMap.get(fileCharacter) == null)
                        characterIntegerHashMap.put(fileCharacter, 1);
                    else
                        characterIntegerHashMap.put(fileCharacter, characterIntegerHashMap.get(fileCharacter) + 1);
                }
                String string="";
                for (Map.Entry<Character,Integer> mapEntry : characterIntegerHashMap.entrySet()) {
                    string+=mapEntry.getKey()+":"+mapEntry.getValue()+"\n";
                }
                fileWriter.write(string);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                    fileWriter.close();
                } catch (IOException|NullPointerException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
