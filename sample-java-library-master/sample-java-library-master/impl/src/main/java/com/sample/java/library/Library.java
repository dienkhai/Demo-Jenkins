package com.sample.java.library;

import com.sample.java.library.api.SomeApi;

/*
 * Dummy library class
 */
public class Library implements SomeApi {
    public boolean someLibraryMethod() {
        return true;
    }

    public void fancyFeature() {

    }

    public String describe() {
        return "Hi! I am a library!";
    }

    public String describe2() {
        return "Hi! I am a library!";
    }

    public void someApiMethod() {
        System.out.println("Hey!");
    }
}
