package spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements IMusic {
    private List<String> songList = new ArrayList<>();

    public void setSongList() {
        songList.add("Eine kleine Nachtmusik");
        songList.add("Für Elise");
        songList.add("'O mio babbino caro' from Gianni Schicchi");
    }

    @Override
    public String getSongList(int number) {
        setSongList();
        return songList.get(number);
    }

}
