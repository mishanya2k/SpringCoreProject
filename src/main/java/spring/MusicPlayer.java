package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private IMusic music1;
    private IMusic music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") IMusic music1, @Qualifier("rockMusic") IMusic music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicGenre genre) {
        Random random = new Random();
        int number = random.nextInt(3);
        if (genre == MusicGenre.CLASSICAL) {
            return  music1.getSongList(number);
        } else
            return  music2.getSongList(number);
    }
}


