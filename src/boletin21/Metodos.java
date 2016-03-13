package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Metodos {
    
    ArrayList<String> palabra = new ArrayList();

    public void cargarArray() {
        palabra.add(JOptionPane.showInputDialog("Introduce la palabra"));
    }

    public void mostrarDatos() {
        for (int i = 0; i < palabra.size(); i++) {
            System.out.println(palabra.get(i));
        }
    }

    public void ordenar() {
        Collections.sort(palabra);
    }

    public void guardarArchivo() {
        File archivo = new File("archivo.txt");
        PrintWriter escribir = null;
        try {
            escribir = new PrintWriter(archivo);
            for (int i = 0; i < palabra.size(); i++) {
                escribir.println(palabra.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error de escritura" + ex.getMessage());
        } finally {
            escribir.close();
        }
        }
        }
    
