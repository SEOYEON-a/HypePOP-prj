package org.hype.mapper;

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

public interface AdminMapper {
    // 팝업스토어 목록 조회
    public List<popStoreVO> getPList(@Param("cri") Criteria cri, @Param("searchPs") String searchPs); 
    public int getPTotal(String searchPs);
    
    // 상품 목록 조회 
    public List<goodsVO> getGList(@Param("cri") Criteria cri, @Param("searchGs") String searchGs);  
    public int getGTotal(String searchGs);
    
    // 전시회 목록 조회
    public List<exhVO> getExhList(@Param("cri") Criteria cri, @Param("searchEs") String searchEs);  
    public int getExhTotal(String searchEs);
    
    // 회원 목록 조회
    public List<signInVO> getMList(@Param("cri") Criteria cri, @Param("searchMs") String searchMs);  
    public int getMTotal(String searchMs);
    
    // 팝업스토어 정보 조회
    public popStoreVO getPopStoreById (int psNo);
    // 상품 정보 조회
    public goodsVO getGoodsById (int gno);  
    // 전시회 정보 조회
    public exhVO getExhById (int exhNo); 
    // 회원 정보 조회
    public signInVO getMembersById (String userId);  
    
    // 팝업스토어 등록
    public int insertPopStore(popStoreVO pvo);
    public int insertPsImage(pImgVO imgVo);  // 이미지 추가
    public int insertPsCat(pCatVO cvo);  // 카테고리 추가
    
    // 팝업스토어 수정
    public pImgVO getPsImg(int psNo);
    public pCatVO getPsCat(int psNo);
    public int updatePopStore(popStoreVO pvo);
    public int updatePsImage(pImgVO imgVo);
    public int updatePsCat(pCatVO cvo);
    
    // 팝업스토어 삭제
    public int deletePopStore(int psNo);
    public int deletePsImage(int psNo);
    public int deletePsCat(int psNo);
    public int deletePsReply(int psNo);
    public int deletePsLike(int psNo);
    public List<goodsVO> getPsnoList(int psNo); // 팝업스토어의 상품 목록 조회
    
    // 상품(전시) 등록
    public List<popStoreVO> getAllPopStores();  // select box에 사용될 팝업스토어 목록
    public int insertGoodsStore(goodsVO gvo);
    public int insertBannerImage(gImgVO gImgVo);  // 배너 이미지 추가
    public int insertDetailImage(gImgVO gImgVo);  // 상세 이미지 추가
    public int insertGcat(gCatVO gvo);  // 카테고리 추가
    
    // 상품(전시) 수정
    public gImgVO getGImgBanner(int gno);
    public gImgVO getGImgDetail(int gno);
    public gCatVO getGCat(int gno);
    public int updateGoodsStore(goodsVO gvo);
    public int updateGImgBanner(gImgVO gImgVo);  // 배너 이미지 수정
    public int updateGImgDetail(gImgVO gImgVo);   // 상세 이미지 수정
    public int updateGCat(gCatVO gcatVo);
    
    // 상품(전시) 삭제
    public int deleteGoodsStore(int gno);
    public int deleteGImgBanner(int gno);
    public int deleteGImgDetail(int gno);
    public int deleteGCat(int gno);
    public int deleteGCart(int gno);
    public int deleteGPay(int gno);
    public int deleteGLike(int gno);
    public int deleteGReply(int gno);
    
    // 전시회 등록
    public int insertExhibition(exhVO evo);
    public int insertExhBannerImage(exhImgVO exhImgVo);  // 배너 이미지 추가
    public int insertExhDetailImage(exhImgVO exhImgVo);  // 상세 이미지 추가
    
    // 전시회 수정
    public exhImgVO getExhImgBanner(int exhNo);
    public exhImgVO getExhImgDetail(int exhNo);
    public int updateExhibition(exhVO evo);
    public int updateExhBannerImage(exhImgVO exhImgVo);  // 배너 이미지 수정
    public int updateExhDetailImage(exhImgVO exhImgVo);  // 상세 이미지 수정
    
    // 전시회 삭제
    public int deleteExhibition(int exhNo);
    public int deleteExhImgBanner(int exhNo);
    public int deleteExhImgDetail(int exhNo);
    public int deleteExhLike(int exhNo);
    public int deleteExhReply(int exhNo);
    
    // Q&A 목록 조회
    public List<qnaVO> getQnaListByType(@Param("qnaType") String qnaType, @Param("qnaAnswer") String qnaAnswer);
    
    // 회원 정보 수정
    public int updateMem(signInVO svo); 
}
