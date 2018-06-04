package capitulo9_ejercicios_resueltos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Definiremos un objeto para probar la serialización
 * a fichero y la desserialización desde fichero
 */
public class EjemploSerializacion{
	
	public static void main(String[] args){
		Agenda a1 = new Agenda("Ana", "Martínez", "Fernández");
		Agenda a2 = new Agenda("Ernesto", "García", "Pérez");
		
		//OBJETO A FICHERO
		FileOutputStream fs = null; 
		ObjectOutputStream os = null;
		try{
			fs = new FileOutputStream("agenda.ser");
			//Creamos el archivo
			os = new ObjectOutputStream(fs);
			//Esta clase tiene el método writeObject() que necesitamos 
			os.writeObject(a1);
			//El método writeObject() serializa el objeto y lo escribe en 
			//el archivo
			os.writeObject(a2);
		}catch(Exception e){ e.printStackTrace();
		}finally{
			//Hay que cerrar siempre los streams
			if (fs!=null) try {fs.close();}
			catch (IOException e) {e.printStackTrace();}
			if (os!=null) try {os.close();}
			catch (IOException e) {e.printStackTrace();}
		}
		//FICHERO A OBJETO
		FileInputStream fis=null; 
		ObjectInputStream ois=null;
		try{
			fis = new FileInputStream("agenda.ser"); 
			ois = new ObjectInputStream(fis);
			a1 = (Agenda) ois.readObject();
			//El método readObject() recupera el objeto
			a2 = (Agenda) ois.readObject();
			ois.close();
		}catch(Exception e){ e.printStackTrace();
		}finally{
			//Hay que cerrar siempre los streams
			if (fis!=null) try {fis.close();}
			catch (IOException e) {e.printStackTrace();}
			if (ois!=null) try {ois.close();}
			catch (IOException e) {e.printStackTrace();}
		}
		System.out.println("Se han serializado los objetos en agenda.ser, abre la carpeta del capitulo9_ejercicios_resueltos del workspace para ver que existe"); 
		System.out.println(a1);
		System.out.println(a2);
	}
}

