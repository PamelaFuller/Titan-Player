/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pamela Fuller
 */

package BLL;


public class Song {

    private String Title;
    private String Artist;
    private String FileName;
    private double Length = 0;
    
    public Song(String title, String artist, String fileName) {
        this.Title = title;
        this.Artist = artist;
        this.FileName = fileName;
    }
    
    private void setLength(double songLength) {
        Length = songLength;
    }
    
    public String getTitle(){
        return Title;
    }
    
    public double getLength(){
        return Length;
    }
    
    public void playSong(){
    
    }

}
