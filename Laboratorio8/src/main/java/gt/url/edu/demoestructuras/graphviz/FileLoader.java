package gt.url.edu.demoestructuras.graphviz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileLoader {

    	public void loadFileWithJava8() {
		String fileName = "/Users/Ana Godínez/Downloads/linked_list.dot";

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

         
        public void LeerArchivo(){
            String arch = "/Users/Ana Godínez/Desktop/prueba.txt";
            
            String elTextTotal = "";
            Stream<String> stream;
            
            try{
               Stream = Files.lines(Paths.get(arch));
               
               Stream.forEach(linea ->{
                   elTextTotal.concat(linea);
                   System.out.println(linea);
               })
                
            }catch (IOException e){
                e.printStackTrace();
            }finally{
                Stream.Close();
            }
            
        }
        
	public void writeUsingFileWriter(String data) {
		File file = new File("/Users/Ana Godínez/Downloads/salida.txt");

		try (FileWriter fw = new FileWriter(file)) {
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
