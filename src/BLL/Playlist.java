/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pamela Fuller
 */

package BLL;

import java.util.ArrayList;
import java.util.List;


public class Playlist {

    private String playlistName;
    List<Song> PL;
    
    public Playlist (String Title) {
        this.playlistName = Title;
        PL = new ArrayList<>();
    }
    
    public String getPlaylistName() {
        return this.playlistName;
    }
    
    public void addSong(Song songToAdd) {
        PL.add(songToAdd);
    }
    
    public void playList(){
        for (Song song : PL){
            song.playSong();
        }
    }
}
