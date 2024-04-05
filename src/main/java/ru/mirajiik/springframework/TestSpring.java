package ru.mirajiik.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer mPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        mPlayer.playMusic();
        context.close();
    }
}
