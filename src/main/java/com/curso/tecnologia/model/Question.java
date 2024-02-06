package com.curso.tecnologia.model;

public class Question {

    private String theme;
    private String question;
    private String answer;

    public Question(){

    }
    public Question(String theme, String question, String answer) {
        this.theme = theme;
        this.question = question;
        this.answer = answer;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "theme='" + theme + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
