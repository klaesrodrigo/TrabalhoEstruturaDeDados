/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDeDados;

import com.sun.istack.internal.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import sun.util.logging.PlatformLogger;
import sun.util.logging.PlatformLogger.Level;

/**
 *
 * @author root
 */
public class Log {
    File arquivo;
    FileReader fileReader;
    BufferedReader bufferedReader;
    FileWriter fileWriter;
    BufferedWriter bufferedWriter;
    
    
    public Log( String erros) throws FileNotFoundException{
        escreverLog(erros);
    }
    
    public void escreverLog(String erros){
        try{
        arquivo = new File("Exceptions.log");
        fileReader = new FileReader(arquivo);
        bufferedReader = new BufferedReader(fileReader);
        Vector texto = new Vector();
        
        while(bufferedReader.ready()){
            texto.add(bufferedReader.readLine());
        }
        
        fileWriter = new FileWriter(arquivo);
        bufferedWriter = new BufferedWriter(fileWriter);
        
        for(int i = 0; i<texto.size(); i++){
            // Escreve cada linha do texto
            bufferedWriter.write(texto.get(i).toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.write(erros);
        bufferedReader.close();
        bufferedWriter.close();
        
        } catch(FileNotFoundException ex){
            try{
                arquivo.createNewFile();
                escreverLog(erros);
            }catch (IOException ex1){
                System.exit(0);
            }
        } catch(IOException er){
            System.exit(0);
        }
    
    }
    
}
