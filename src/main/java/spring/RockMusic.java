package spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements IMusic {
    private List<String> songList = new ArrayList<>();

    public void setSongList(){
        songList.add("Monsters");
        songList.add("Hero");
        songList.add("Courtesy Call");
    }
    public String getSongList(int number)
    {
        setSongList();
        return songList.get(number);
    }
}
