package ex_002_json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main( String[] args ) {
		// Объект Person
		Person person = new Person( "Vasya", 20, Arrays.asList("Moscow", "Kiev", "Dubai", "SPB") );
		Person person2 = new Person( "Nikolay", 30, Arrays.asList("Moscow", "SPB") );
		List<Person> persons = new ArrayList<Person>();
		persons.add( person );
		persons.add( person2 );
		
		// Создаем обработчик JSON 
        Gson gson = new GsonBuilder().create();
        
        // Переодим объект person в JSON строку
        String jString = gson.toJson( persons );
        
        // Вывод строки JSON в консоль
        System.out.println( jString );

//        // Создаем экземпляр класса Person из json строки
//        Person person1 = gson.fromJson( jString, Person.class );
//
//        // Вывод данных объекта
//        System.out.println( person1.getName() + " " + person1.getAge() );
//        List<String> geos = person1.getGeoHistory();
//        for (String geo : geos) {
//            System.out.println(geo);
//        }
	}
	
}
