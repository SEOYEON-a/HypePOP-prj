# 내 취향의 팝업스토어 전시회 찾고 구매까지! HypePop

![readme_mockup2](https://user-images.githubusercontent.com/112460466/210706312-6a44b60d-a42e-4210-b334-9e5983f70fb3.png)



## 프로젝트 소개

- Hyep POP은 팝업스토어와 전시회를 탐색하고 파티원을 모집하여 실시간 채팅을 할 수 있으며 구매까지 이어지는 내 주변 행사 찾기 사이트입니다.
- 관리자 페이지에서 팝업스토어, 굿즈, 전시회 등록, 수정, 삭제가 가능하고 회원 정보 수정과 문의 리스트를 볼 수 있습니다.
- 팝업스토어 메인페이지에서 인기있는 팝업스토어와 관심사별 팝업스토어를 볼 수 있습니다.
- 굿즈 메인페이지에서 인기있는 굿즈와 관심사별 굿즈를 볼 수 있습니다.
- 전시회 메인페이지에서 다양한 전시회를 볼 수 있습니다.
- 캘린더로 한달마다 열리는 팝업스토어와 전시회 일정을 볼 수 있습니다.
- 파티 구인 게시판에서 파티원 모집 게시글을 작성할 수 있으며 클릭 시 실시간으로 채팅할 수 있습니다.
- 팝업스토어 상세 페이지에서 해당 팝업스토어의 상세 정보 확인과 후기 작성 및 수정, 삭제, 상품 리스트를 볼 수 있습니다.
- 굿즈 상세 페이지에서 해당 굿즈와 관련된 팝업스토어로 이동할 수 있으며 상세 정보 확인과 후기 작성 및 수정, 삭제, 장바구니 담기,
  결제 페이지로 이동할 수 있습니다.
- 전시회 상세페이지에서 해당 전시회 상세 정보를 확인할 수 있으며 후기를 작성할 수 있습니다.
- 검색을 통해 마음에 드는 팝업스토어와 굿즈, 전시회를 검색할 수 있습니다.
- 마이페이지에서 내가 쓴 후기, 찜 목록 확인, 결제 목록을 확인할 수 있습니다.

<br>

## 팀원 구성

<div align="center">

| **이서연** | **김현재** | **김요셉** | **김윤** | **김진환** |
| :------: |  :------: | :------: | :------: | :------: |
| [<img src="https://github.com/user-attachments/assets/1348490d-a8e3-486c-9d7a-9ac7b3fd684e" height=150 width=150> <br/> @SEOYEON-a](https://github.com/SEOYEON-a) | <img src="https://github.com/user-attachments/assets/4ba22779-886f-400c-b65f-a83f3becaab2" height=130 width=130> <br/> | <img src="https://github.com/user-attachments/assets/25e8976f-6bf9-43f5-8b5c-7aef97b691a1" height=130 width=130> <br/> | <img src="https://github.com/user-attachments/assets/be81161e-0bee-4483-84f7-9f5fb93dbfae" height=140 width=140> <br/> | <img src="https://github.com/user-attachments/assets/164d6e0e-6bcb-4314-9aa2-b5c3be181f2d" height=140 width=140> <br/>

</div>

<br>

## 1. 개발 환경

- Front : HTML5, CSS3, JS ES6
- Back-end : Spring 3.9.11, WEB SOCKET, Apache Tomcat 9.0
- DB / API / GIT : ORACLE, Naver Map, Notion, ERD Cloud
- 협업 툴 : Figma
- 버전 및 이슈관리 : Github
- 디자인 : [Figma](https://www.figma.com/design/i8rPbGQSTtVPKmuwHurX0R/kacang?node-id=171-15&t=oSf2XtciC0DIgeVE-1)
<br>

## 2. 채택한 개발 기술과 브랜치 전략

### React, styled-component

- React
    - 컴포넌트화를 통해 추후 유지보수와 재사용성을 고려했습니다.
    - 유저 배너, 상단과 하단 배너 등 중복되어 사용되는 부분이 많아 컴포넌트화를 통해 리소스 절약이 가능했습니다.
- styled-component
    - props를 이용한 조건부 스타일링을 활용하여 상황에 알맞은 스타일을 적용시킬 수 있었습니다.
    - 빌드될 때 고유한 클래스 이름이 부여되어 네이밍 컨벤션을 정하는 비용을 절약할 수 있었습니다.
    - S dot naming을 통해 일반 컴포넌트와 스타일드 컴포넌트를 쉽게 구별하도록 했습니다.
    
### Recoil

- 최상위 컴포넌트를 만들어 props로 유저 정보를 내려주는 방식의 경우 불필요한 props 전달이 발생합니다. 따라서, 필요한 컴포넌트 내부에서만 상태 값을 가져다 사용하기 위해 상태 관리 라이브러리를 사용하기로 했습니다.
- Redux가 아닌 Recoil을 채택한 이유
    - Recoil은 React만을 위한 라이브러리로, 사용법도 기존의 useState 훅을 사용하는 방식과 유사해 학습비용을 낮출 수 있었습니다.
    - 또한 Redux보다 훨씬 적은 코드라인으로 작동 가능하다는 장점이 있었습니다.
- 로그인과 최초 프로필 설정 시 유저 정보를 atom에 저장하여 필요한 컴포넌트에서 구독하는 방식으로 사용했습니다.

### eslint, prettier

- 정해진 규칙에 따라 자동적으로 코드 스타일을 정리해 코드의 일관성을 유지하고자 했습니다.
- 코드 품질 관리는 eslint에, 코드 포맷팅은 prettier에 일임해 사용했습니다.
- airbnb의 코딩 컨벤션을 참고해 사용했고, 예외 규칙은 팀원들과 협의했습니다.
- 협업 시 매번 컨벤션을 신경 쓸 필요 없이 빠르게 개발하는 데에 목적을 두었습니다.

### 브랜치 전략

- Git-flow 전략을 기반으로 main, develop 브랜치와 feature 보조 브랜치를 운용했습니다.
- main, develop, Feat 브랜치로 나누어 개발을 하였습니다.
    - **main** 브랜치는 배포 단계에서만 사용하는 브랜치입니다.
    - **develop** 브랜치는 개발 단계에서 git-flow의 master 역할을 하는 브랜치입니다.
    - **Feat** 브랜치는 기능 단위로 독립적인 개발 환경을 위하여 사용하고 merge 후 각 브랜치를 삭제해주었습니다.

<br>

## 3. 프로젝트 구조

```
├── README.md
├── .eslintrc.js
├── .gitignore
├── .prettierrc.json
├── package-lock.json
├── package.json
│
├── public
│    └── index.html
└── src
     ├── App.jsx
     ├── index.jsx
     ├── api
     │     └── mandarinAPI.js
     ├── asset
     │     ├── fonts
     │     ├── css_sprites.png
     │     ├── logo-404.svg
     │     └── logo-home.svg
     │          .
     │          .
     │          .
     ├── atoms
     │     ├── LoginData.js
     │     └── LoginState.js
     ├── common
     │     ├── alert
     │     │     ├── Alert.jsx
     │     │     └── Alert.Style.jsx
     │     ├── button
     │     ├── comment
     │     ├── inputBox
     │     ├── post
     │     ├── postModal
     │     ├── product
     │     ├── tabMenu
     │     ├── topBanner
     │     └── userBanner
     ├── pages
     │     ├── addProduct
     │     │     ├── AddProduct.jsx
     │     │     └── AddProduct.Style.jsx
     │     ├── chatList
     │     ├── chatRoom
     │     ├── emailLogin
     │     ├── followerList
     │     ├── followingList
     │     ├── home
     │     ├── join
     │     ├── page404
     │     ├── postDetail
     │     ├── postEdit
     │     ├── postUpload
     │     ├── productEdit
     │     ├── profile
     │     ├── profileEdit
     │     ├── profileSetting
     │     ├── search
     │     ├── snsLogin
     │     └── splash
     ├── routes
     │     ├── privateRoutes.jsx
     │     └── privateRoutesRev.jsx  
     └── styles
           └── Globalstyled.jsx
```

<br>

## 4. 역할 분담

### 🍊이서연

- **UI**
    - 페이지 : 관리자 메인페이지, 팝업스토어 등록/수정/삭제 페이지, 굿즈 등록/수정/삭제 페이지, 전시회 등록/수정/삭제 페이지, 회원 정보 수정 페이지, 문의 리스트 페이지
- **기능**
    - 팝업스토어/굿즈/전시회 검색, 팝업스토어/굿즈/전시회 등록 및 수정/삭제, 회원 정보 수정, 문의 리스트 필터링 출력

<br>
    
### 👻김현재

- **UI**
    - 페이지 : 팝업스토어 메인 페이지, 팝업스토어 상세 페이지, 팝업스토어 검색 페이지, 지도
- **기능**
    - 팝업스토어 검색, 인기순 상위 8개 출력, 관심사별 8개 출력, 후기 작성/수정/삭제, 지도 API, GitHub 취합

<br>

### 🔉김요셉

- **UI**
    - 페이지 : 고객센터 메인 페이지, 공지사항 작성/상세 페이지, 1:1 문의 작성/상세 페이지, 캘린더 페이지, 전시회 메인/상세 페이지
- **기능**
    - 고객센터/1:1 문의/FAQ 게시글 출력, 공지사항 작성/수정/삭제, 1:1 작성/수정/삭제, 캘린더 날짜별 사이드바 정보 출력

<br>

### 🐬김윤

- **UI**
    - 페이지 : 마이페이지, 로그인, 회원가입
- **기능**
    - 회원가입, 로그인/로그아웃, 내가 쓴 후기글 출력, 내가 찜한 팝업스토어/전시회/굿즈 출력, 내 장바구니 목록 출력, 결제 상품 목록 출력, 회원 탈퇴
    
<br>

### 😎김진환

- **UI**
    - 페이지 : 굿즈 메인페이지, 굿즈 상세 페이지, 굿즈 검색 페이지, 파티 구인 게시판 페이지, 실시간 채팅 페이지
- **기능**
    - 굿즈 검색, 인기순 상위 8개 출력, 관심사별 8개 출력, 후기 작성/수정/삭제, 파티 구인 게시판 목록 출력, 파티 구인 게시글 작성, 실시간 채팅
    
<br>

## 5. 개발 기간 및 작업 관리

### 개발 기간

- 전체 개발 기간 : 2022-09-12 ~ 2022-11-08
- UI 구현 : 2022-09-16 ~ 2022-09-23
- 기능 구현 : 2022-09-24 ~ 2022-10-31
- CSS 수정 : 2024-11-01 ~ 2024-11-06

<br>

### 작업 관리

- GitHub를 사용하여 매주마다 병합하여 진행상황을 공유했습니다.
- 주간회의를 진행하며 작업 순서와 방향성에 대한 고민을 나누고 GitHub Wiki에 회의 내용을 기록했습니다.

<br>

## 6. 페이지별 기능

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

## 7. 트러블 슈팅

- [CamelCase 이슈](https://github.com/SEOYEON-a/HypePOP-prj/wiki/%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_Camel-Case)

- [COMMIT 이슈](https://github.com/SEOYEON-a/HypePOP-prj.wiki.git)

<br>

## 9. 개선 목표

- API 모듈화 : API를 불러오는 코드의 반복이 많아 모듈화할 예정
- lighthouse Performance 증진
    - 모든 페이지에서 특히 Best Practices & SEO 점수는 90~100으로 우수
    - Performance 점수가 대체적으로 미흡한 문제
    
    ![KakaoTalk_Photo_2023-01-04-16-55-30](https://user-images.githubusercontent.com/112460466/210591134-09bf8efd-3c34-4b99-a3d7-895ca99e1457.png)
    
- **23-01-17 성능 개선 내용**
    
    ![성능개선 후](https://user-images.githubusercontent.com/106502312/212872369-7ceeb2cf-d551-41d2-bfb0-01e35e9903fe.png)
    
    - 이미지 최적화
        - `<img>` 요소에 `width` , `height` 속성값을 명시해 불필요한 Reflow를 방지했습니다.
        - browser-image-compression 라이브러리를 사용해 유저가 업로드하는 이미지를 압축했습니다.
        - Intersection Observer API를 사용해 Lazy Loading 기법을 적용하여 홈 피드의 게시글 이미지가 viewport 내에 들어오는 순간 로딩되도록 변경했습니다.
    - 웹폰트 최적화
        - WOFF2 포맷을 추가하고 가장 우선적으로 적용되도록 선언했습니다.
        - 서브셋 폰트로 교체해 용량을 줄였습니다.
    
<br>

## 10. 프로젝트 후기

### 이서연

깃헙을 통한 협업에 익숙해지는 것, 서로 감정 상하지 않고 무사히 마무리하는 것이 1차적인 목표였어서 항상 이 부분을 명심하면서 작업했습니다.
각자 페이지를 작업하고 합치는 과정에서 마주친 버그들이 몇 있었는데, 시간에 쫓기느라 해결하기에 급급해서 제대로 트러블슈팅 과정을 기록하지 못한 게 살짝 아쉬운 부분으로 남습니다. 그래도 2022년 한 해 동안 가장 치열하게 살았던 한 달인 것 같습니다. 조원들 모두에게 고생했다고 전하고 싶습니다🧡
