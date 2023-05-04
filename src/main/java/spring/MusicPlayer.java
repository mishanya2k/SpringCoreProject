package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<IMusic> musicList;

    public MusicPlayer(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }


    public String playMusic(){
    Random random = new Random();
    int number = random.nextInt(3);
    return musicList.get(number).getSong();
    }
}


