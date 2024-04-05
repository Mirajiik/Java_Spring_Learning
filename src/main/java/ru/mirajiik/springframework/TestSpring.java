package ru.mirajiik.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer mPlayer = new MusicPlayer(music);
        mPlayer.playMusic();
        mPlayer = new MusicPlayer(context.getBean("rockMusic", Music.class));
        mPlayer.playMusic();
        context.close();
    }
}
