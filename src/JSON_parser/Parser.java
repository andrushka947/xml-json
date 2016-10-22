package JSON_parser;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Parser {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new FileReader("d:\\for java/json.txt"));
        String text1 = "{\n" +
                "    \"name\": \"Vsevolod\",\n" +
                "    \"surname\": \"Ievgiienko\",\n" +
                "    \"phones\": [\"044-256-78-90\", \"066-123-45-67\"],\n" +
                "    \"sites\": [\"http://site1.com\", \"http://site2.com\"],\n" +
                "    \"address\": {\n" +
                "         \"country\": \"UA\",\n" +
                "         \"city\": \"Kyiv\",\n" +
                "         \"street\": \"abcd\"\n" +
                "    }\n" +
                "}\n";

        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(new File("E:\\for_java/json.txt"));

        while(in.hasNext()) {
            sb.append(in.nextLine() + "\r\n");
        }
        in.close();
        String text = sb.toString();
        //String text = text1;              //to perform a request from text that is printed higher
        Gson gson = new GsonBuilder().create();
        Structure st = (Structure) gson.fromJson(text, Structure.class);

        System.out.println(st.name);
        System.out.println(st.surname);
        System.out.println(Arrays.toString(st.phones));
        System.out.println(Arrays.toString(st.sites));
        System.out.println(st.address.country);
        System.out.println(st.address.city);
        System.out.println(st.address.street);

    }
}
