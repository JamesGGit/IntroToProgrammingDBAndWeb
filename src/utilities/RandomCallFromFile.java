package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomCallFromFile {
    
    private static Random random = new Random();

    
    public static void main(String args[]) {
        
        if (args.length == 0) {
            System.out.println("Usage java RandomShuffle @fullyQualifiedFileName");
            System.exit(-1);
        }
        
        String studentFileName = args[0];
        
        for (int i = 0; i < 3;i++) {
            System.out.println("Call:"+ getRandomlySelectedStudent(studentFileName));    
        }
        
        
        
    }
    
    public static String getRandomlySelectedStudent(String studentFileName) {
        String allStudentsFile = studentFileName;
        String calledStudentsFile = studentFileName + ".called";
        
        Set<String> allStudents = getStudentsFromFile(allStudentsFile);
        Set<String> calledStudents = getStudentsFromFile(calledStudentsFile);
        
        allStudents.removeAll(calledStudents);
        
        if (allStudents.isEmpty()) {
            deleteFile(calledStudentsFile);
            allStudents = getStudentsFromFile(allStudentsFile);
        }
        
        int size = allStudents.size();
        int randomNumberInRange = random.nextInt(size);
        //System.out.println("randomNumberInRange:"+randomNumberInRange);
        int count = 0;
        String nameToCall = null;
        for (Iterator<String> iter = allStudents.iterator();iter.hasNext();) {
            nameToCall = iter.next();
            if (count == randomNumberInRange) {
                addToFile(calledStudentsFile,nameToCall);
                break;
            }
            count++;
        }
        
        return nameToCall;
    }
    
    public static void addToFile(String fileName,String name) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName, true))) {
            printWriter.write(name+"\n");
        } catch (IOException ioException) {
            printMessage(ioException.getMessage());
        }
    }
    
    public static void deleteFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception ex) {
            printMessage(ex.getMessage());
        }
    }
    
    public static Set<String> getStudentsFromFile(String fileName) {
        Set<String> students = new HashSet<>();
        try {
            File file = new File(fileName);

            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
                String read = null;
                while ( (read = br.readLine()) != null ) {
                    students.add(read);
                }
                br.close();
            }
            
        } catch (IOException ioException) {
            printMessage(ioException.getMessage());
        }
        
        return students;
        
    }
    
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
