package com.fzg.responsibility;

public class AHandler extends PostHandler{
    @Override
    public void handlerRequest(Post post) {
        String content = post.getContent();
        content = content.replace("广告","**");
        post.setContent(content);
        System.out.println("过滤广告");
        next(post);
    }
}
