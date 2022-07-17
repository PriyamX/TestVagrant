import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonData {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Json-files\\RCB.json");
		Object obj= jsonparser.parse(reader);
		//typecasting jsonobject to stirng
		JSONObject teamobj = (JSONObject)obj;
		String teamname= (String) teamobj.get("name");
		String location =(String) teamobj.get("location");
		System.out.println("Name of Team: " + teamname);
		System.out.println("City: " + location);

		JSONArray arr = (JSONArray) teamobj.get("player");

		for (int i=0; i<arr.size(); i++)
		{
			JSONObject playerinfo= (JSONObject) arr.get(i);
			
			String playername= (String) playerinfo.get("name");
			String playercountry= (String) playerinfo.get("country");
			String role= (String) playerinfo.get("role");
			String price= (String) playerinfo.get("price-in-crores");
			
			System.out.println("Player number: " + i );
			System.out.println("\n Player: " + playername);
			System.out.println("\n Country: " + playercountry);
			System.out.println("\n Role: " + role);
			System.out.println("\n Price: " + price + "\n");
			 
			
			}
			

		}







	}

}
