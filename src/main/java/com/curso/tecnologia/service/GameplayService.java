package com.curso.tecnologia.service;

import com.curso.tecnologia.dto.PlayerDTO;
import com.curso.tecnologia.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameplayService {

    //Instanciando um objeto com Spring, não usa o new Objeto(), usa o @Autowired
    @Autowired
    private QuizDataBaseService quizDatabaseService;

    public PlayerDTO startQuizGameplay(String nickName, String theme, User user){

        PlayerDTO playerDTO = new PlayerDTO(nickName, 0, theme, user);

        return null;
    }

}
