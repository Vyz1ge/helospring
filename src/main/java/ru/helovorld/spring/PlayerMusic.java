package ru.helovorld.spring;

import java.util.ArrayList;
import java.util.List;

public class PlayerMusic {
    private String albom;
    private int volume;
    private List<Music> Musics = new ArrayList<>();
    public PlayerMusic(){}
    public String playMusic(){
        String s = "";
        for(Music x : Musics){
            s+="Play . . .  "+x.getMusic()+" \n";
        }
        return s;
    }

    public String getAlbom() {
        return albom;
    }

    public void setAlbom(String albom) {
        this.albom = albom;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusics() {
        return Musics;
    }

    public void setMusics(List<Music> Musics) {
        this.Musics = Musics;
    }
}
