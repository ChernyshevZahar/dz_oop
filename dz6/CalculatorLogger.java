package dz6;

import java.io.BufferedWriter;  
import java.io.FileWriter;  
import java.io.IOException;  

 /**
 * Ведет логированый файл использования калкулятора
 * @param logFilePath путь для создания файла логирования
 */ 

public class CalculatorLogger {  
    private String logFilePath;  
  
    /**
     * Ведет логированый файл использования калкулятора
     * @param logFilePath путь для создания файла логирования
     */
    public CalculatorLogger(String logFilePath) {  
        this.logFilePath = logFilePath;  
    }  
  
    public void log(String message) {  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath, true))) {  
            writer.write(message);  
            writer.newLine();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
