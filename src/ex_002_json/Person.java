package ex_002_json;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
    private int age;
    private List<String> geoHistory = new ArrayList<>();

    public Person(String name, int age, List<String> geoHistory) {
        this.name = name;
        this.age = age;
        this.geoHistory = geoHistory;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getGeoHistory() {
        return geoHistory;
    }
}
