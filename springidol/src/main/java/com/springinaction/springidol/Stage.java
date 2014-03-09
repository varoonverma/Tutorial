package com.springinaction.springidol;

/**
 * Created by varunverma on 9/03/2014.
 */
public class Stage {
    private Stage() {
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage(); //<co id="co_lazyLoad"/>
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance; //<co id="co_returnInstance"/>
    }

    public void greet(){
        System.out.println("Hello");
    }
}
