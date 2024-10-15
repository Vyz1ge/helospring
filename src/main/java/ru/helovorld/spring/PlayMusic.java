package ru.helovorld.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
/*
        Music song = context.getBean("MusicBean", Music.class);
        System.out.println("Playing . . . "+song.getMusic());
        PlayerMusic playerMusic = new PlayerMusic(song);
        System.out.println();
        System.out.println(playerMusic.playMusic());
*/
        PlayerMusic playerMusic1 = context.getBean("PlayerMusic",PlayerMusic.class);
        System.out.println(playerMusic1.playMusic());
        context.close();
    }
}
