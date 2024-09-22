package com.leolmcoding.simple_editor.pattern.caretaker;

import com.leolmcoding.simple_editor.pattern.memento.EditorState;
import com.leolmcoding.simple_editor.pattern.originator.Editor;

import java.util.*;

// Memento Caretaker
public class History {
    private final Deque<EditorState> states = new ArrayDeque<>();
    private final Editor editor;

    public History(Editor editor) {
        this.editor = editor;
    }
    public void backup(){
        EditorState editorState = editor.createState();
        System.out.println("Adding State:");
        System.out.println(editorState);
        states.add(editorState);
    }
    public void undo(){
        if(!states.isEmpty() && states.size()>=2){
            states.removeLast();
            EditorState prevState = states.getLast();
            editor.restore(prevState);
        }
    }

    public void showHistory(){
        System.out.println("History of this Editor");
        states.forEach(System.out::println);
    }
}
