package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private AnswerRepository answerRepository;

//	@Transactional
	@Test
	void testJpa() {
		for (int i = 0; i < 300; i++) {
			String subject = "테스트 데이터 입니다 : [%03d]".formatted(i);
			String content = "내용 무";
			this.questionService.create(subject,content,null);
		}
	}
}








//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1); // 첫 번째 질문 저장
//
//		Question q2 = new Question();
//		q2.setSubject("스프링 부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2); // 두 번째 질문 저장

	//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?",q.getSubject());

//Optional<Question> q1 = this.questionRepository.findById(2);
//assertTrue(q1.isPresent());
//Question q = q1.get();
//
//Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);

//Optional<Answer> oa = this.answerRepository.findById(1);
//assertTrue(oa.isPresent());
//Answer og = oa.get();
//assertEquals(2, og.getQuestion().getId());

//Optional<Question> oq = this.questionRepository.findById(2);
//assertTrue(oq.isPresent());
//Question q = oq.get();
//
//List<Answer> answerList = q.getAnswerList();
//
//assertEquals(1, answerList.size());
//assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
