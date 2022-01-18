

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import Multimedia.SelectSong;


public class JUnitSelectSongTest {
    
    @Test
    public void test() {
       ArrayList<String> song =  SelectSong.playlistErstellen();
        assertEquals(song.get(0), "Elton John & Dua Lipa - Cold Heart");
        assertEquals(song.get(3), "Ed Sheeran - Shivers");
        assertEquals(song.get(5), "Acraze feat. Cherish - Do It To It");
    }
    
    

}
