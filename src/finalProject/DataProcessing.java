package finalProject;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by Matt on 12/5/2015.
 */
public class DataProcessing {

    private DataRetrieval retrieveData = new DataRetrieval();

    private JSONObject projectData;
    private JSONObject vulnerabilityData;
    private Array userFavorites;
    private int userUpdateFrequency;
    private String userLocation;

    public DataProcessing()throws Exception{
        projectData = retrieveData.sendProjectToProcess();
        vulnerabilityData = retrieveData.sendVulnerabilitiesToProcess();

    }


    public void sortDataByProjectFavorites(){
        //check to see if project is in the favorites Array, if it is display the project
    }

    public void sortDataByProjectLocation(){
        //projects dont seem to have a location attribute so im unsure of how to implement this
    }

    public ArrayList<JSONObject> sortDataByProjectAll(){
        JSONArray projectsArray = (JSONArray) projectData.get("project");
        int size = projectsArray.size();
        ArrayList<JSONObject> projectArrayList = new ArrayList<>();

        for(int i =0; i < size; i++){

            JSONObject newProjectData = (JSONObject) projectsArray.get(i);
            projectArrayList.add(newProjectData);

        }

        return projectArrayList;
    }

    public void sortDataByStatistics(){

    }

    public void sortDataByAffectedProjects(){
        //based on a certain vunerability show that projects that are affected, at this time it seems like the projects returned dont specify what vunerabilities they have
    }

    public void sortDataByVulnerabilitesLocal(){
        //again sorting by location is vauge to me
    }

    public void sortDataByVulnerabilitesTimeframe(){

    }

    public ArrayList<JSONObject> sortDataByVulnerabilitesAll(){

       JSONArray vulnerabilitiesArray = (JSONArray) vulnerabilityData.get("vulnerability");
        int size = vulnerabilitiesArray.size();
        ArrayList<JSONObject> vulnerabilityArrayList = new ArrayList<>();

        for(int i =0; i < size; i++){

            JSONObject newVulnerabilityData = (JSONObject) vulnerabilitiesArray.get(i);
            vulnerabilityArrayList.add(newVulnerabilityData);
            //System.out.println(vulnerabilityArrayList.get(i).toString());
        }

        return vulnerabilityArrayList;
    }


    public void sortDataByDependencies(){

    }

    public void sortDataByVulnerabilites(){

    }

    public void updateData() throws Exception{
        projectData = retrieveData.sendProjectToProcess();
        vulnerabilityData = retrieveData.sendVulnerabilitiesToProcess();
    }





}