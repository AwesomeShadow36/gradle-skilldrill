package edu.isu.cs.cs2263;


import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class IOManager {

    //local variables
    private ArrayList<Student> readStud=new ArrayList<>();

    // constructor
    public IOManager (){}

    //methods
    public void writeData(String file, Student[] data) throws IOException {
        //the GsonBuilder along with the two methods just makes the resulting file look nicer
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        //writes the file to the specified file path
        FileWriter writer= new FileWriter(file);
        //takes our students and writes em to the file specified in the main app and stops the writer
        gson.toJson(data, writer);
        writer.close();

    }
    public ArrayList<Student> readData(String file) throws IOException {
        //don't need the builder here as you are just pulling it back from the file
        Gson gson= new Gson();
        ArrayList<Student> students= new ArrayList<>();
        Reader reader= Files.newBufferedReader(Paths.get(file));
        //this is to cast the generic type needed by the Reader as an ArrayList so we can pull it back as one
        Type arrayList= new TypeToken<ArrayList<Student>>(){}.getType();
        students = gson.fromJson(reader, arrayList);
        //stops the reader
        reader.close();
        return students;

    }

}
