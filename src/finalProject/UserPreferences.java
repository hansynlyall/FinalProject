package finalProject;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Matt on 12/5/2015.
 */
public class UserPreferences { //this class will have to write data to a file inside that app that can be read on startup so users preferences can be saved

    private String locationPreference;
    private int updateFrequencyPreference;

    public UserPreferences(){

    }

    private void writeLocationToSaveFile(String location){

    }

    private void writeFavoriteToSaveFile(String favoirte){

    }

    private void writeUpdateFrequencyToSaveFile(){

    }

    public String readLocationFromSaveFile(){
        //locationPreference =
        return locationPreference;
    }

    public Array readFavoritesFromSaveFile(){

        Array favorites = null;
        return favorites;
    }

    public int readUpdateFrequencyFromSaveFile(){ //1 = daily, 2 = Weekly, 3 = Monthly
        //updateFrequencyPreference =

        return updateFrequencyPreference;
    }
}

