package edu.carleton.COMP2601.finalproject;

/**
 * Created by AveryVine on 2017-03-15.
 */

public interface ReactorInterface {
    public void register(String type, EventHandler event);
    public void deregister(String type);
    public void dispatch(Event event) throws NoEventHandler;
}
