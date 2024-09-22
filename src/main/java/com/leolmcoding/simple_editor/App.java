package com.leolmcoding.simple_editor;


import com.leolmcoding.simple_editor.pattern.caretaker.History;
import com.leolmcoding.simple_editor.pattern.originator.Editor;

public class App
{
    public static void main( String[] args )
    {
        Editor editor= new Editor();
        System.out.println( "Hello World!" );
        History history = new History(editor);
        history.undo();history.undo();history.undo();
        history.backup();
        editor.setTitle("Memento");
        history.backup();
        editor.setTitle("Hello, Memento");
        editor.setContent("Hello there!");
        history.backup();
        System.out.println(editor);
        history.undo();
        System.out.println(editor);
        System.out.println("-------");
        history.undo();history.undo();history.undo();
        history.showHistory();
    }
}
