package com.curso.tecnologia;

import com.curso.tecnologia.model.Question;
import com.curso.tecnologia.service.QuizDataBaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class SimpleQuizApplicationTests {

	@Autowired
	private QuizDataBaseService quizDataBaseService;
	@Test
	void dataBaseQuizTests() {
		ArrayList<Question> allQuestionsList = quizDataBaseService.showAllQuestions();
		System.out.println(allQuestionsList);
		System.out.println("pause");

		System.out.println(quizDataBaseService.findByTheme(allQuestionsList, "Cinema"));
	}

}