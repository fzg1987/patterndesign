package com.fzg.adapter;

public class Test {
    public static void main(String[] args) {
        MusicPlayer player = new PlayAdapter();
        player.play("mp3","xxx.mp3");
        player.play("wma","xxx.wma");
    }
}
