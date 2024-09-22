package com.leolmcoding.simple_editor.pattern.memento;

import java.time.LocalDateTime;

// Memento - Memento
public class EditorState {

    private final String title;
    private final String content;

    // State meta data
    private final LocalDateTime stateCreatedAt;



    public EditorState(String title, String content) {
        this.title = title;
        this.content = content;
        stateCreatedAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    public LocalDateTime getStateCreatedAt() {
        return stateCreatedAt;
    }

    @Override
    public String toString() {
        return "EditorState{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", stateCreatedAt=" + stateCreatedAt +
                '}';
    }
}
