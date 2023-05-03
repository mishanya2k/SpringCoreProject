package spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {


    private List<IMusic> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void setMusicList(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (IMusic music : musicList) {
            System.out.println("Playing " + music.getSong() + " by " + music.getAuthor());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}

