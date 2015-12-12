package finalProject;

import org.json.simple.JSONObject;

import java.util.ArrayList;

/**
 * Created by Matt on 12/5/2015.
 */
public class EventHandler {


    private DataProcessing dataProcessor;

    public EventHandler() throws Exception{
        dataProcessor = new DataProcessing();
    }

    public String[] getProjectsToArray(){


        ArrayList<JSONObject> tempArray = dataProcessor.sortDataByProjectAll();
        int size = tempArray.size();
        String[] listOfProjects = new String[size];

        for(int i =0; i<size; i++){
            listOfProjects[i] = tempArray.get(i).toString();
        }
        return listOfProjects;
    }

    public String[] getVulnerabilitiesToArray(){


        ArrayList<JSONObject> tempArray = dataProcessor.sortDataByVulnerabilitesAll();
        int size = tempArray.size();
        String[] listOfVulnerabilities = new String[size];

        for(int i =0; i<size; i++){
            listOfVulnerabilities[i] = tempArray.get(i).toString();
        }
        return listOfVulnerabilities;
    }












}
