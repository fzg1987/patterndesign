package com.fzg.responsibility;

public abstract class PostHandler {
    private PostHandler handler;

    public void setHandler(PostHandler handler) {
        this.handler = handler;
    }

    public abstract void handlerRequest(Post post);

    protected final void next(Post post){
        if(this.handler != null){
            this.handler.handlerRequest(post);
        }
    }
}
