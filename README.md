# 내 취향의 팝업스토어 전시회 찾고 구매까지! HypePop

![HypePop](https://github.com/user-attachments/assets/b4e9d6de-df47-46dc-ac02-bbe2cd5a8281)


## 프로젝트 소개

- Hyep POP은 팝업스토어와 전시회를 탐색하고 파티원을 모집하여 실시간 채팅을 할 수 있으며 구매까지 이어지는 내 주변 행사 찾기 사이트입니다.
- 관리자 페이지에서 팝업스토어, 굿즈, 전시회 등록, 수정, 삭제가 가능하고 회원 정보 수정과 문의 리스트를 볼 수 있습니다.

<br>

## 팀원 구성

<div align="center">

| **이서연** | **김현재** | **김요셉** | **김윤** | **김진환** |
| :------: |  :------: | :------: | :------: | :------: |
| [<img src="https://github.com/user-attachments/assets/1348490d-a8e3-486c-9d7a-9ac7b3fd684e" height=150 width=150> <br/> @SEOYEON-a](https://github.com/SEOYEON-a) | <img src="https://github.com/user-attachments/assets/4ba22779-886f-400c-b65f-a83f3becaab2" height=130 width=130> <br/> | <img src="https://github.com/user-attachments/assets/25e8976f-6bf9-43f5-8b5c-7aef97b691a1" height=130 width=130> <br/> | <img src="https://github.com/user-attachments/assets/be81161e-0bee-4483-84f7-9f5fb93dbfae" height=135 width=135> <br/> | <img src="https://github.com/user-attachments/assets/164d6e0e-6bcb-4314-9aa2-b5c3be181f2d" height=135 width=135> <br/>

</div>

<br>

## 1. 개발 환경

- Front : HTML5, CSS3, JS ES6
- Back-end : Spring Legacy 3.9.11, WEB SOCKET, Apache Tomcat 9.0
- DB / API / GIT : ORACLE XE 11.2, Naver Map, Notion, ERD Cloud
- 협업 툴 : Figma
- 버전 및 이슈관리 : Github
- 디자인 : [Figma](https://www.figma.com/design/i8rPbGQSTtVPKmuwHurX0R/kacang?node-id=171-15&t=oSf2XtciC0DIgeVE-1)
<br>

## 2. 페이지별 기능

### [초기화면]
- 관리자로 로그인했을 때 뜨는 메인페이지이며 첫화면 입니다.

| 초기화면 |
|----------|
|![admin main page](https://github.com/user-attachments/assets/d9d74047-cc41-4ccc-9ca5-fa96597613eb)|

<br>

## [출력 기능]

### [팝업스토어 리스트 출력]
- 팝업스토어 관리하기를 클릭하면 현재 등록된 팝업스토어 리스트가 출력됩니다.
- 한 페이지에 15개가 출력되고 15개가 넘어가면 페이징 처리가 되어 넘어갑니다.
- 마우스 오버 시 분홍색으로 바뀝니다.

| 팝업스토어 리스트 출력 |
|----------|
|![adminmainpage-popupList](https://github.com/user-attachments/assets/ce366f91-3c1e-4b64-b929-024f9c1e4f24)|

<br>

### [굿즈 리스트 출력]
- 쇼핑몰 관리하기를 클릭하면 현재 등록된 굿즈 리스트가 출력됩니다.
- 한 페이지에 32개가 출력되고 32개가 넘어가면 페이징 처리가 되어 넘어갑니다.
- 마우스 오버 시 분홍색으로 바뀝니다.

| 굿즈 리스트 출력 |
|----------|
|![adminmainpage-goodsList](https://github.com/user-attachments/assets/258e9984-5c00-4374-a670-9f97c8dc23b9)|

<br>

### [전시회 리스트 출력]
- 전시회 관리하기를 클릭하면 현재 등록된 전시회 리스트가 출력됩니다.
- 한 페이지에 14개가 출력되고 14개가 넘어가면 페이징 처리가 되어 넘어갑니다.
- 마우스 오버 시 분홍색으로 바뀝니다.

| 전시회 리스트 출력 |
|----------|
|![adminmainpage-exhibitList](https://github.com/user-attachments/assets/af507c2b-dd86-4959-ab2e-78a92d0539e3)|

<br>

### [회원 리스트 출력]
- 회원 관리하기를 클릭하면 현재 등록된 회원 리스트가 출력됩니다.
- 한 페이지에 13개가 출력되고 13개가 넘어가면 페이징 처리가 되어 넘어갑니다.
- 마우스 오버 시 분홍색으로 바뀝니다.

| 회원 리스트 출력 |
|----------|
|![adminmainpage-userList](https://github.com/user-attachments/assets/bcbf09ff-e4b7-4371-be5a-cc8f4d57487b)|

<br>

### [문의 리스트 출력]
- 문의 리스트 확인을 클릭하면 현재 등록된 문의 리스트가 출력됩니다.
- 문의 유형과 답변 여부에 따라 필터링된 리스트가 출력됩니다.
- 관리자 메인 페이지를 클릭하면 메인페이지로 돌아갑니다.

| 문의 리스트 출력 |
|----------|
|![adminmainpage-adminaskList](https://github.com/user-attachments/assets/fb60ff70-149a-4d18-998b-64a6303a0234)|

<br>

## [검색 기능]

### [팝업스토어 검색]
- 팝업스토어 관리하기 클릭 후 검색창에 팝업스토어 이름을 검색하면 해당 검색어와 맞는 팝업스토어가 나옵니다.
- 한 페이지에 15개가 출력되고 15개가 넘어가면 페이징 처리가 되어 넘어갑니다.
- 마우스 오버 시 분홍색으로 바뀝니다.

| 팝업스토어 검색 |
|----------|
|![adminmainpage-popupListSearch](https://github.com/user-attachments/assets/ce366f91-3c1e-4b64-b929-024f9c1e4f24)|

<br>

### [굿즈 검색]
- 쇼핑몰 관리하기 클릭 후 검색창에 굿즈 이름을 검색하면 해당 검색어와 맞는 굿즈가 나옵니다.
- 마우스 오버 시 분홍색으로 바뀝니다.

| 굿즈 검색 |
|----------|
|![adminmainpage-goodsListSearch](https://github.com/user-attachments/assets/258e9984-5c00-4374-a670-9f97c8dc23b9)|

<br>

### [전시회 검색]
- 전시회 관리하기 클릭 후 검색창에 전시회 이름을 검색하면 해당 검색어와 맞는 전시회가 나옵니다.
- 마우스 오버 시 분홍색으로 바뀝니다.

| 전시회 검색 |
|----------|
|![adminmainpage-exhibitListSearch](https://github.com/user-attachments/assets/af507c2b-dd86-4959-ab2e-78a92d0539e3)|

<br>

## [등록 기능]

### [팝업스토어 등록]
- 팝업스토어 등록하기를 클릭하면 팝업스토어 등록 페이지가 나옵니다.
- 이미지 등록하기를 클릭하면 팝업스토어 이미지를 업로드할 수 있고 카테고리를 선택한 후 텍스트 정보 입력한 뒤에 등록하기를 클릭하면 등록이 됩니다.

| 팝업스토어 등록 |
|----------|
|![admin-popupRegister](https://github.com/user-attachments/assets/ede0728f-078f-4c3f-9a57-3f4d9b078ed0)|

<br>

### [굿즈 등록]
- 쇼핑몰 관리하기를 클릭하면 등록하기 버튼에서 굿즈 등록하기 버튼으로 바뀝니다.
- 굿즈 등록하기를 클릭하면 굿즈 등록 페이지가 나옵니다.
- select box에서 등록된 팝업스토어 리스트가 출력되고 해당 팝업스토어를 클릭하면
  하단에 있는 팝업스토어 번호에 일치하는 번호가 입력됩니다.
- 상품 배너 이미지를 클릭하면 상품 배너 이미지를 업로드할 수 있고 상품 상세 이미지를 클릭하면 상품 상세 이미지를 업로드할 수 있습니다.
- 카테고리를 선택한 후 텍스트 정보 입력한 뒤에 등록하기를 클릭하면 등록이 됩니다.

| 굿즈 등록 |
|----------|
|![admin-goodsregister-ezgif com-speed](https://github.com/user-attachments/assets/81043cd8-2b01-463d-88ae-777335f9da7d)|

<br>

### [전시회 등록]
- 전시회 관리하기를 클릭하면 등록하기 버튼에서 전시회 등록하기 버튼으로 바뀝니다.
- 전시회 등록하기를 클릭하면 전시회 등록 페이지가 나옵니다.
- 전시회 배너 이미지를 클릭하면 전시회 배너 이미지를 업로드할 수 있고 전시회 상세 이미지를 클릭하면 전시회 상세 이미지를 업로드할 수 있습니다.
- 텍스트 정보 입력한 뒤에 등록하기를 클릭하면 등록이 됩니다.

| 전시회 등록 |
|----------|
|![admin-exhibitregister-ezgif com-speed](https://github.com/user-attachments/assets/62cbda26-4c8c-4f7e-b1ad-e8db53fa6d9b)|

<br>

## [수정 기능]

### [팝업스토어 수정]
- 팝업스토어 정보를 클릭하면 팝업스토어 수정 페이지로 넘어갑니다.
- 취소 및 리스트로 돌아가기 클릭 시 리스트로 돌아갑니다.
- 메인 페이지 클릭 시 메인페이지로 돌아갑니다.
- 수정완료 클릭 시 업데이트 됩니다.

| 팝업스토어 수정 |
|----------|
|![admin-popup-edit](https://github.com/user-attachments/assets/9841b124-6f7f-4ae6-a814-ce0781665d47)|

<br>

### [굿즈 수정]
- 굿즈 정보를 클릭하면 굿즈 수정 페이지로 넘어갑니다.
- 취소 및 리스트로 돌아가기 클릭 시 리스트로 돌아갑니다.
- 메인 페이지 클릭 시 메인페이지로 돌아갑니다.
- 수정완료 클릭 시 업데이트 됩니다.

| 굿즈 수정 |
|----------|
|![admin-goods-edit-](https://github.com/user-attachments/assets/9221d9cc-aba1-4a42-9e94-d29d1a207bae)|

<br>

### [전시회 수정]
- 전시회 정보를 클릭하면 전시회 수정 페이지로 넘어갑니다.
- 취소 및 리스트로 돌아가기 클릭 시 리스트로 돌아갑니다.
- 메인 페이지 클릭 시 메인페이지로 돌아갑니다.
- 수정완료 클릭 시 업데이트 됩니다.

| 전시회 수정 |
|----------|
|![admin-exhibit-edit-ezgif com-speed](https://github.com/user-attachments/assets/ad06df95-6fd5-4460-b293-0a9fdf64c38d)|

<br>

### [회원 수정]
- 회원 정보를 클릭하면 회원 수정 페이지로 넘어갑니다.
- 취소 및 리스트로 돌아가기 클릭 시 리스트로 돌아갑니다.
- 관리자 메인 페이지 클릭 시 메인페이지로 돌아갑니다.
- 수정완료 클릭 시 업데이트 됩니다.

| 회원 수정 |
|----------|
|![admin-userbacktoList-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/12450e39-f0c4-48a9-9d8e-9e821c5219fc)|
|![admin-usereditList](https://github.com/user-attachments/assets/0de8ff9f-ae37-4bce-bcd2-0f51c56e04f3)|

<br>

## [삭제 기능]

### [팝업스토어 삭제]
- 팝업스토어 정보를 클릭하면 팝업스토어 삭제 페이지로 넘어갑니다.
- 취소 및 리스트로 돌아가기 클릭 시 리스트로 돌아갑니다.
- 메인 페이지 클릭 시 메인페이지로 돌아갑니다.
- 삭제 클릭 시 삭제됩니다.

| 팝업스토어 삭제 |
|----------|
|![admin-popup-delete](https://github.com/user-attachments/assets/57ef7dcc-6659-4190-8288-f7732941d24d)|

<br>

### [굿즈 삭제]
- 굿즈 정보를 클릭하면 굿즈 삭제 페이지로 넘어갑니다.
- 취소 및 리스트로 돌아가기 클릭 시 리스트로 돌아갑니다.
- 메인 페이지 클릭 시 메인페이지로 돌아갑니다.
- 삭제 클릭 시 삭제됩니다.

| 굿즈 삭제 |
|----------|
|![admin-goods-delete](https://github.com/user-attachments/assets/3a83bf26-afc9-48cd-9208-88872406da39)|

<br>

### [전시회 삭제]
- 전시회 정보를 클릭하면 전시회 삭제 페이지로 넘어갑니다.
- 취소 및 리스트로 돌아가기 클릭 시 리스트로 돌아갑니다.
- 메인 페이지 클릭 시 메인페이지로 돌아갑니다.
- 삭제 클릭 시 삭제됩니다.

| 전시회 삭제 |
|----------|
|![admin-exhibit-delete-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/0ae46b6c-11e9-4e54-b734-069006ec29ca)|

<br>

## 3. 트러블 슈팅

- [CamelCase 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_Camel-Case)

- [COMMIT 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_COMMIT)

- [CSS 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_CSS)
  
- [Encoding 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_Encoding)
  
- [Mapping 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_Mapping)
  
- [Paging 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_Paging)
  
- [ReflectionException 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_ReflectionException)

- [Button Event 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_%EB%B2%84%ED%8A%BC-%EB%8F%99%EC%9E%91)

- [DB 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_%EC%9C%A0%EC%A0%80-%EB%B2%88%ED%98%B8)

- [DATA 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_%EC%9C%A0%EC%A0%80-%EC%A0%95%EB%B3%B4)

- [Filtering 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_%ED%95%84%ED%84%B0%EB%A7%81)

<br>

## 4. 개선 목표

- API : 다양한 API를 사용해보지 않아서 API 기능의 다양성 필요
- CSS 보완 : CSS의 미흡한 점이 많아서 보완 필요
- 문서 작업 : 시간 문제로 클래스 정의서를 작성하지 못하여서 패키지 정의서로 대체

<br>

## 5. 개발 기간

### 개발 기간

- 전체 개발 기간 : 2024-09-12 ~ 2024-11-08
- UI 구현 : 2024-09-16 ~ 2024-09-23
- 기능 구현 : 2024-09-24 ~ 2024-10-31
- CSS 수정 : 2024-11-01 ~ 2024-11-06

<br>

## 6. 역할 분담

### 🌞 이서연

- **UI**
    - 페이지 : 관리자 메인페이지, 팝업스토어 등록/수정/삭제 페이지, 굿즈 등록/수정/삭제 페이지, 전시회 등록/수정/삭제 페이지, 회원 정보 수정 페이지, 문의 리스트 페이지
- **기능**
    - 팝업스토어/굿즈/전시회 검색, 팝업스토어/굿즈/전시회 등록 및 수정/삭제, 회원 정보 수정, 문의 리스트 필터링 출력

### 👥 팀원 역할 요약

- **김현재**: 팝업스토어 관련 UI 및 검색, 후기 작성, 지도 API 구현, GitHub 취합  
- **김요셉**: 고객센터, 공지사항, 문의 관련 게시판 및 캘린더 페이지 구현  
- **김윤**: 로그인/회원가입, 마이페이지 기능 구현 (찜, 후기, 결제 목록 등)  
- **김진환**: 굿즈 메인/상세/검색 페이지, 파티 구인 게시판 및 실시간 채팅 기능 구현
<br>

## 7. 프로젝트 규칙

### 규칙

- 취합은 매주 금요일날 진행하며, 일주일에 한 번씩 회의를 진행하여 현재 진행 상황을 공유했습니다.
- 팀장이 GitHub로 취합을 하면, 팀원들이 clone을 받아서 적용하는 방식으로 진행하였습니다.
  
<br>

## 8. 프로젝트 후기

### 🌞 이서연

처음 해보는 팀 프로젝트여서 걱정이 많았습니다. 중간에 insert 기능 구현 기간에 지속적인 에러 발생으로 인해 한 주가 
밀렸지만 끝까지 기능 구현을 성공적으로 마치고 나서 뿌듯함이 제일 컸고 도와주신 팀원 분들이 계셔서 감사했습니다. 이번 프로젝트를 통해 CRUD를 잘 이해할 수 있었던 좋은 기회가 된 것 같아 뿌듯했습니다. 
실제 프로젝트를 진행해보니 웹 사이트 하나를 만들 때 세부적인 기능들이 매우 많이 들어간다는 것을 알게 되었고 까다로워 보이지 않았던 부분도 실제로 구현해보니 신경 쓸 게 많다는 것을 알게 되었던 시간이었습니다.

### 👥 팀원 한줄 회고 요약

- **김현재**: 팀장 역할을 수행하며 많은 어려움과 동시에 성취감을 느꼈고, 지도 API 사용 등 기술적 경험을 쌓음  
- **김요셉**: 혼자 개발할 때와는 다른 협업 경험을 통해 문서 기반 설계와 팀워크의 중요성을 느낌  
- **김윤**: 설계와 역할 분담의 중요성을 깨달았고, 오류 해결 능력에 대한 자신감 향상  
- **김진환**: 실시간 기능 구현 경험을 통해 WebSocket 이해도가 향상되었고, 사용자 중심 개발의 복잡성을 체감함

