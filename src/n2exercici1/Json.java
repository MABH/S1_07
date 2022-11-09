package n2exercici1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.*;

public class Json {
	
	private Gson gson = new Gson();
	private Object objecte;
	
	public Json(Object objecte) {		
		this.objecte = objecte;
		String directori ="C:\\Users\\Miguel Angel\\Desktop\\mJson.json";
		String jsonString = gson.toJson(objecte);
		GuardarJson(jsonString, directori);
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
}

