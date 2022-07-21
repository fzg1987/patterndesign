package com.fzg.adapter;

public class PlayAdapter implements MusicPlayer{
    private MyPlayer player;

    public PlayAdapter() {
        this.player = new MyPlayer();
    }

    @Override
    public void play(String type, String filename) {
        if (type.equals("mp3")) this.player.playMp3(filename);
        if (type.equals("wma")) this.player.playWma(filename);
    }
}
