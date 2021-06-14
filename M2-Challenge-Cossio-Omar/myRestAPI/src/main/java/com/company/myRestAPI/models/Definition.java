package com.company.myRestAPI.models;

import java.util.Objects;

public class Definition {

    private int id;
    private String wordOfDay;
    private String definition;

    public Definition(int id, String wordOfDay, String definition) {
        this.id = id;
        this.wordOfDay = wordOfDay;
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWordOfDay() {
        return wordOfDay;
    }

    public void setWordOfDay(String wordOfDay) {
        this.wordOfDay = wordOfDay;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition that = (Definition) o;
        return id == that.id && Objects.equals(wordOfDay, that.wordOfDay) && Objects.equals(definition, that.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wordOfDay, definition);
    }

    @Override
    public String toString() {
        return "Definition{" +
                "id=" + id +
                ", wordOfDay='" + wordOfDay + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
