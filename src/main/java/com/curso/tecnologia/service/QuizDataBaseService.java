package com.curso.tecnologia.service;

import com.curso.tecnologia.model.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class QuizDataBaseService {

    public ArrayList<Question> showAllQuestions(){
        ArrayList<Question> questionsList = new ArrayList<>();

        questionsList = StaticDataBaseOnlyForTests.staticDataBaseWithHardcode();

        return questionsList;
    }

    public ArrayList<Question> findByTheme(ArrayList<Question> allQuestions, String theme) {
        ArrayList<Question> filteredQuestionList = new ArrayList<>();

        for (Question question : allQuestions){
            if (question.getTheme().equalsIgnoreCase(theme)){ //o IgnoreCase é pra ignorar se é maiúscula ou minúscula
                filteredQuestionList.add(question);
            }
        }
        return filteredQuestionList;
    }

}
