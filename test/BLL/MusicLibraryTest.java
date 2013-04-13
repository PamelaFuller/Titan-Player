/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/*
import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
*/ 
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pamela Fuller
 */
public class MusicLibraryTest {
    
    public MusicLibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void addSongTest(){
        MusicLibrary myLibrary = new MusicLibrary();
        myLibrary.addSong(new Song("Amazing Grace", "George Beverly Shea", "C:\\myMusic\\AmazingGrace.mp3"));
        myLibrary.addSong(new Song("This is my Father's World", "Aubrey Houston","C:\\myMusic\\FathersWorld.mp3"));
        assertEquals(2, myLibrary.songCount());
    }
    
    @Test
    public void removeSongTest(){
        MusicLibrary myLibrary = new MusicLibrary();
        myLibrary.addSong(new Song("Amazing Grace", "George Beverly Shea","C:\\myMusic\\AmazingGrace.mp3"));
        myLibrary.addSong(new Song("This is my Father's World", "Aubrey Houston","C:\\myMusic\\FathersWorld.mp3"));
        myLibrary.removeSong(1);
        assertEquals(1, myLibrary.songCount());
    }
    
}

