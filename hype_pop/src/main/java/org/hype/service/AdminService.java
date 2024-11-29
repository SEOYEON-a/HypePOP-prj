package org.hype.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.hype.domain.Criteria;
import org.hype.domain.exhImgVO;
import org.hype.domain.exhVO;
import org.hype.domain.gCatVO;
import org.hype.domain.gImgVO;
import org.hype.domain.goodsVO;
import org.hype.domain.pCatVO;
import org.hype.domain.pImgVO;
import org.hype.domain.payVO;
import org.hype.domain.popStoreVO;
import org.hype.domain.qnaVO;
import org.hype.domain.signInVO;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {    
    // 관리자의 Header 관련 기능들
    // 매장 관리 검색 리스트
    public List<popStoreVO> getPList(Criteria cri, String searchPs);    
    public int getPTotal(String searchPs);

    // 상품 관리 검색 리스트
    public List<goodsVO> getGList(Criteria cri, String searchGs);  
    public int getGTotal(String searchGs);

    // 전시회 관리 검색 리스트
    public List<exhVO> getExhList(@Param("cri") Criteria cri, String searchEs);  
    public int getExhTotal(String searchEs);

    // 회원 관리 검색 리스트
    public List<signInVO> getMList(Criteria cri, String searchMs);
    public int getMTotal(String searchMs);

    // 특정 매장 조회
    public popStoreVO getPopStoreById(int psNo);  
    // 특정 상품 조회
    public goodsVO getGoodsById(int gno);  
    // 특정 전시회 조회
    public exhVO getExhById(int exhNo); 
    // 특정 회원 조회
    public signInVO getMembersById(String userId); 

    // 매장 등록
    public int insertPopStore(popStoreVO pvo); 
    
    // 매장 정보 수정
    public int updatePopStore(popStoreVO pvo);
    public pImgVO getPsImg(int psNo);
    public pCatVO getPsCat(int psNo);
    
    // 매장 삭제
    public int deletePopStore(int psNo);
    
    // 모든 매장 목록을 select box에 사용
    public List<popStoreVO> getAllPopStores();    

    // 상품 등록
    public int insertGoodsStore(goodsVO gvo);
    
    // 상품 정보 수정
    public int updateGoodsStore(goodsVO gvo);
    
    // 상품 배너 및 상세 이미지 조회
    public gImgVO getGImgBanner(int gno);
    public gImgVO getGImgDetail(int gno);
    
    // 상품의 카테고리 정보 조회
    public gCatVO getGCat(int gno);
    
    // 상품 삭제
    public int deleteGoodsStore(int gno);
    
    // 전시회 등록
    public int insertExhibition(exhVO evo);
    
    // 전시회 정보 수정
    public int updateExhibition(exhVO evo);
    
    // 전시회 배너 및 상세 이미지 조회
    public exhImgVO getExhImgBanner(int exhNo);
    public exhImgVO getExhImgDetail(int exhNo);
    
    // 전시회 삭제
    public int deleteExhibition(int exhNo);
    
    // 문의 유형과 답변 상태에 따라 Q&A 리스트 조회
    public List<qnaVO> getQnaListByType(String qnaType, String qnaAnswer);  

    // 회원 정보 수정
    public int updateMem(signInVO svo); 
}
