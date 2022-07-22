package com.fzg.responsibility;

public class Test {
    public static void main(String[] args) {
        PostHandler aHandler = new AHandler();
        PostHandler bHandler = new BHandler();
        aHandler.setHandler(bHandler);

        Post post = new Post();
        post.setContent("正常内容，广告，游戏推广");
        System.out.println("过滤前的内容：" + post.getContent());
        aHandler.handlerRequest(post);
        System.out.println("过滤后的内容：" + post.getContent());
    }
}
