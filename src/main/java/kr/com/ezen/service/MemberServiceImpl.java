package kr.com.ezen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.com.ezen.dto.MemberVO;
import kr.com.ezen.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
	
	//생성자 주입
	private final MemberMapper mapper;

	//필드 주입
//	@Autowired
//	private MemberMapper mapper;
	
	@Override
	public void insertMember(MemberVO vo) {
		mapper.insertMember(vo);
	}

	@Override
	public void updateMember(MemberVO vo) {
		mapper.updateMember(vo);
	}

	@Override
	public void deleteMember(int id) {
		mapper.deleteMember(id);
	}

	@Override
	public MemberVO selectOne(int id) {
		MemberVO vo = mapper.selectOneMember(id);
		return vo;
	}

	@Override
	public List<MemberVO> list() {
		
		return mapper.selectAllMember();
	}
	
	
}
