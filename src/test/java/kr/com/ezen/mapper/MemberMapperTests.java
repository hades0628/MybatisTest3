package kr.com.ezen.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.com.ezen.dto.MemberVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testInsert() {
		MemberVO vo = MemberVO.builder()
				.id(11)
				.name("나")
				.phone("010-1111-1111")
				.address("정자동")
				.build();
		log.info(mapper.insertMember(vo));
	}
	@Test
	public void testUpdate() {
		MemberVO vo = MemberVO.builder()
				.id(3)
				.name("조조조")
				.phone("111-1111-1111")
				.address("정자동")
				.build();
		mapper.updateMember(vo);
	}
	@Test
	public void testDelete() {
		
		mapper.deleteMember(9);
	}
	
	@Test
	public void testSelectOne() {
		MemberVO vo = mapper.selectOneMember(5);
		log.info(vo);
	}
	
	@Test
	public void testSelectList() {
		mapper.selectAllMember().forEach(vo -> log.info(vo));
	}
	
	
		
}
