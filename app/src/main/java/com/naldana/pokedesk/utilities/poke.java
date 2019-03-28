package com.naldana.pokedesk.utilities;

import java.util.ArrayList;

public class poke {
    private int count;
    private String next;
    private String previous;
    private ArrayList<pokeResults> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public ArrayList<pokeResults> getResults() {
        return results;
    }

    public void setResults(ArrayList<pokeResults> results) {
        this.results = results;
    }
}
