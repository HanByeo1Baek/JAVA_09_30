package com.green.database;

public class Board {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
    private String createdAt;
    private String updatedAt;

    public int getBoardId() {
        return boardId;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getWriter() {
        return writer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
