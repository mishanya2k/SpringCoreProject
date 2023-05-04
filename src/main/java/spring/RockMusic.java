package spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements IMusic {


    @Override
    public String getSong() {
        return "Monsters";
    }
}
