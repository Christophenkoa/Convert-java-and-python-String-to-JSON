 

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XML_to_JSON {
	
	private static final int PRETTY_PRINT_INDENT_FACTOR = 4;
	
	public static void main() {
		
		String xmlstring = 
		"<user>"+
        		"<user><name>Test 1</name><age>25</age></user>"+
        		"<user><name>Test 2</name><age>25</age></user>"+
		"</user>";
		
		JSONObject jsonObject = null;
		try {
			jsonObject = XML.toJSONObject(xmlstring);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jsonPrettyPrintString = null;
		try {
			jsonPrettyPrintString = jsonObject.toString(PRETTY_PRINT_INDENT_FACTOR);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println(jsonPrettyPrintString);
	}
}
