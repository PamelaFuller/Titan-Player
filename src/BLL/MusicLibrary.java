/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Pamela Fuller
 */
public class MusicLibrary {
    List<Song> songs;
    
    public MusicLibrary(){
        songs = new ArrayList<Song>();
    }
    
    public void addSong(Song songToAdd){
        songs.add(songToAdd);
    }

    public void removeSong(int songToRemove) {
        songs.remove(songToRemove);
    }

    public int songCount(){
        return songs.size();
    }
    
}
