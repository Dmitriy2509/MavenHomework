package PetClinic.configuration.com;

public class Configuration {

    private String baseUrl;

    //private static final String BASE_URL= "http://139.59.149.247:8000/petclinic";
    private static final String BASE_URL_LOCALHOST= "http://localhost:8000/petclinic";

    public String getBaseUrl() {
       // -DbaseUrl="http://139.59.149.247:8000/petclinic";

       this.baseUrl= System.getProperty("baseUrl");
        return baseUrl;
    }


}
