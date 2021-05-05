import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {
		
		// Map is implemented by the class HashMap
		Map<String,String> phonebook = new HashMap<>();
		// Mapping the keys and values.
		phonebook.put("Rajeev", "096");  
		phonebook.put("Anjali", "055");
		
		// System.out.println(phonebook.get("Rajeev"));
		Set<String> keys = phonebook.keySet();
		for(String i : keys)
		{
			System.out.println(i + "	"+ phonebook.get(i));
		}
		
		
		
		
		
	}

}
