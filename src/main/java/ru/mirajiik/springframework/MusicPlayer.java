package ru.mirajiik.springframework;

public class MusicPlayer {
    private Music music;
    private String name;
    private Integer volume;
    // Constructors
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer(){ }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setVolume(Integer volume){
        this.volume = volume;
    }
    public Integer getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
