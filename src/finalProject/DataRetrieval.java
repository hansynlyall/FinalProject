package finalProject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by Matt on 12/5/2015.
 */


public class DataRetrieval {



    public DataRetrieval() {

    }



    private static String readUrl(String urlString) throws Exception { //this method reads the text from the URL and converts it to a string that we can use with our JSON parser
        BufferedReader reader = null;

        try {
            URL url = new URL(urlString);
            reader = new BufferedReader((new InputStreamReader(url.openStream())));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }


    private  JSONObject pollServerForProjects() throws Exception { //this method takes the text from the URL and puts it into a JSON object which we can then manipulate easily, get name, id etc

        JSONObject jsonObject = new JSONObject();

        try {


            JSONParser jsonParser = new JSONParser();
            jsonObject  = (JSONObject) jsonParser.parse(readUrl("http://aseg.cs.concordia.ca/segps-rest/project/list?rows=10&wt=json"));



        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

        } catch (IOException ex) {

            ex.printStackTrace();

        } catch (ParseException ex) {

            ex.printStackTrace();

        } catch (NullPointerException ex) {

            ex.printStackTrace();

        }
        return jsonObject;
    }

    private  JSONObject pollServerForVulnerabilities() throws Exception { //this method takes the text from the URL and puts it into a JSON object which we can then manipulate easily, get name, id etc

        JSONObject jsonObject = new JSONObject();

        try {

            JSONParser jsonParser = new JSONParser();
             jsonObject = (JSONObject) jsonParser.parse(readUrl("http://aseg.cs.concordia.ca/segps-rest/vulnerability/list?rows=10&wt=json"));


        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

        } catch (IOException ex) {

            ex.printStackTrace();

        } catch (ParseException ex) {

            ex.printStackTrace();

        } catch (NullPointerException ex) {

            ex.printStackTrace();

        }

        return jsonObject;
    }


    public  JSONObject sendProjectToProcess() throws Exception{

        return pollServerForProjects();
    }


    public  JSONObject sendVulnerabilitiesToProcess() throws Exception{

        return pollServerForVulnerabilities();
    }






    }







