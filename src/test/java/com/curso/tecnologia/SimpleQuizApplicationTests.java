package com.curso.tecnologia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleQuizApplicationTests {

	@Autowired
	private QuizDataBaseService quizDataBaseService;
	@Test
	void contextLoads() {

		System.out.println(quizDataBaseService.showAllQuestions());
		System.out.println("pause");
	}

}
