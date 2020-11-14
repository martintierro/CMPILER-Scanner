import java.util.*;
import java.lang.*;
import java.io.*;

public class State {
    private String name;
    private Hashtable<Character, State> transitions;

    public State(String name) {
        this.name = name;
    }

    public State(String name, Hashtable transitions) {
        this.name = name;
        this.transitions = transitions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hashtable getTransitions() {
        return transitions;
    }

    public void setTransitions(Hashtable transitions) {
        this.transitions = transitions;
    }

    public void addTransition(Character input, State nextState){
        transitions.put(input, nextState);
    }
}