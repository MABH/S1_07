package n3exercici1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Json {
	
	private Gson gson = new Gson();
	private Object objecte;
	
	public Json(Object objecte) {		
		this.objecte = objecte;
		String directori ="C:\\Users\\Miguel Angel\\Desktop\\mJson.json";
		String jsonString = gson.toJson(objecte);
		GuardarJson(jsonString, directori);
		ComprovarAnotacio();		
	}		
	
	
	public void GuardarJson(String json, @Directori String directori)
	{					
		try {
			Files.write( Paths.get(directori), json.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}	
	
	public void ComprovarAnotacio() {
		 try {
		      Method m = Json.class.getMethod("GuardarJson",String.class, String.class);

		      Parameter path = m.getParameters()[1];
		      Directori directori=path.getAnnotation(Directori.class);
		      System.out.println("Anotaciò: "+directori.directori());
		    } catch (NoSuchMethodException exc) {
		      System.out.println("El mètode no existeix.");
		    }
	}
}

