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
| [<img src="https://github.com/user-attachments/assets/1348490d-a8e3-486c-9d7a-9ac7b3fd684e" height=150 width=150> <br/> @SEOYEON-a](https://github.com/SEOYEON-a) | <img src="https://github.com/user-attachments/assets/4ba22779-886f-400c-b65f-a83f3becaab2" height=130 width=130> <br/> | <img src="https://github.com/user-attachments/assets/25e8976f-6bf9-43f5-8b5c-7aef97b691a1" height=130 width=130> <br/> | <img src="https://github.com/user-attachments/assets/164d6e0e-6bcb-4314-9aa2-b5c3be181f2d" height=140 width=140> <br/> | <img src="https://avatars.githubusercontent.com/u/76766459?v=4" height=150 width=150> <br/>

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

## 6. 신경 쓴 부분

- [접근제한 설정](https://github.com/likelion-project-README/README/wiki/README-6.%EC%8B%A0%EA%B2%BD-%EC%93%B4-%EB%B6%80%EB%B6%84_%EC%A0%91%EA%B7%BC%EC%A0%9C%ED%95%9C-%EC%84%A4%EC%A0%95)

- [Recoil을 통한 상태관리 및 유지](https://github.com/likelion-project-README/README/wiki/README-6.%EC%8B%A0%EA%B2%BD-%EC%93%B4-%EB%B6%80%EB%B6%84_Recoil%EC%9D%84-%ED%86%B5%ED%95%9C-%EC%83%81%ED%83%9C%EA%B4%80%EB%A6%AC-%EB%B0%8F-%EC%9C%A0%EC%A7%80)

<br>

## 7. 페이지별 기능

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
|![admin-popup-edit](https://github.com/user-attachments/assets/9841b124-6f7f-4ae6-a814-ce0781665d47)|

<br>

### [프로필 설정]
- 회원가입 페이지의 유효성 검사를 통과해야 진입할 수 있습니다.
- 프로필 설정에 필요한 프로필 사진, 사용자 이름, 계정 ID, 소개를 입력받습니다.
- 사용자 이름과 계정 ID는 필수 입력사항입니다.
- 계정 ID에는 형식 및 중복 검사가 진행됩니다.
- 프로필 사진은 등록하지 않을 경우 기본 이미지가 등록됩니다.

| 프로필 설정 |
|----------|
|![setProfile](https://user-images.githubusercontent.com/112460466/210173749-2da6c9af-eb93-4eea-9663-1a03e19299ec.gif)|

<br>

### [로그인]
- 이메일 주소와 비밀번호를 입력하면 입력창에서 바로 유효성 검사가 진행되고 통과하지 못한 경우 각 경고 문구가 입력창 하단에 표시됩니다.
- 이메일 주소의 형식이 유효하지 않거나 비밀번호가 6자 미만일 경우에는 각 입력창 하단에 경구 문구가 나타납니다.
- 작성이 완료된 후, 유효성 검사가 통과된 경우 로그인 버튼이 활성화됩니다.
- 로그인 버튼 클릭 시 이메일 주소 또는 비밀번호가 일치하지 않을 경우에는 경고 문구가 나타나며, 로그인에 성공하면 홈 피드 화면으로 이동합니다.

| 로그인 |
|----------|
|![login](https://user-images.githubusercontent.com/112460466/210177956-c716414e-01c2-4c1e-b1f7-6562b9b7a857.gif)|

<br>

### [로그아웃]
- 상단 의 kebab menu를 클릭 후 나타나는 모달창의 로그아웃 버튼을 클릭하면 확인창이 뜹니다.
- 로그아웃시 로컬 저장소의 토큰 값과 사용자 정보를 삭제하고 초기화면으로 이동합니다.

| 로그아웃 |
|----------|
|![logout](https://user-images.githubusercontent.com/112460466/210178009-11225733-7af5-4b8b-aa1c-fe264af01797.gif)|

<br>

### [상하단 배너]
- 상단 배너 : 각 페이지별로 다른 종류의 버튼을 가지고 있습니다.
    - 뒤로가기 : 브라우저 상에 기록된 이전 페이지로 돌아갑니다.
    - 검색 : 사용자 검색 페이지로 이동합니다.
    - 사용자 이름 : 채팅룸 페이지의 경우 상대방의 사용자 이름을 보여줍니다.
    - kebab menu : 각 페이지 또는 컴포넌트에 따른 하단 모달창을 생성합니다.
        - 상품, 댓글, 게시글 컴포넌트 - 삭제, 수정, 신고하기
        - 사용자 프로필 페이지 - 설정 및 사용자 정보, 로그아웃
- 하단 탭 메뉴 : 홈, 채팅, 게시물 작성, 프로필 아이콘을 클릭하면 각각 홈 피드, 채팅 목록, 게시글 작성 페이지, 내 프로필 페이지로 이동합니다.

| 상하단 배너 |
|----------|
|![tab](https://user-images.githubusercontent.com/112460466/210178028-3185f944-6ac1-468a-94ba-b32cdc5e380e.gif)|

<br>

### [홈 피드]
- 자신이 팔로우 한 유저의 게시글이 최신순으로 보여집니다.
- 팔로우 한 유저가 없거나, 팔로워의 게시글이 없을 경우 검색 버튼이 표시됩니다.
- 게시글의 상단 유저 배너 클릭 시 게시글을 작성한 유저의 프로필 페이지로, 본문 클릭 시 게시글 상세 페이지로 이동합니다.

| 팔로우하는 유저가 없을 때 | 팔로우하는 유저가 있을 때 |
|----------|----------|
|![home0](https://user-images.githubusercontent.com/112460466/210379059-48900aac-3735-45c6-a249-bc9c41b49414.gif)|![home1](https://user-images.githubusercontent.com/112460466/210379110-49153d27-0405-48e6-adfb-62c7818d2f43.gif)|

<br>

### [검색]
- 사용자 이름 혹은 계정 ID로 유저를 검색할 수 있습니다.
- 검색어와 일치하는 단어는 파란색 글씨로 표시됩니다.
- 클릭 시 해당 유저의 프로필 페이지로 진입합니다.

| 검색 |
|----------|
|![search](https://user-images.githubusercontent.com/112460466/210379805-6c8a42c0-0de8-48d3-8f75-cdf0ae5f4fb6.gif)|

<br>

### [프로필]

#### 1. 내 프로필
- 상단 프로필란에 프로필 수정과 상품 등록 버튼이 나타납니다.
- 판매중인 상품란에는 사용자가 판매하는 상품이 등록되며, 판매중인 상품이 없을 경우에는 영역 자체가 나타나지 않습니다.
- 게시글란은 상단의 리스트형과 앨범형 두 개의 버튼을 통해서 나누어 볼 수 있습니다.
    - 리스트형의 경우, 사용자가 작성한 글 내용과 이미지, 좋아요와 댓글의 수를 보여줍니다.
    - 앨범형의 경우, 사용자 게시글 중 이미지가 있는 글만 필터링해 바둑판 배열로 보여줍니다.
- 게시글을 클릭하면 각 게시글의 상세페이지로 이동합니다.

| 리스트형 & 앨범형 게시글 | 팔로잉 & 팔로워 리스트 |
|----------|----------|
|![myProfile](https://user-images.githubusercontent.com/112460466/210380492-40560e0b-c306-4e69-8939-cc3e7dc3d8fe.gif)|![followList](https://user-images.githubusercontent.com/112460466/210380539-d09b0bd7-0b61-4b22-85fa-f75e6bcecb68.gif)|

<br>

#### 2. 타 유저의 프로필
- 버튼을 클릭해 해당 사용자를 팔로우 또는 언팔로우할지 결정할 수 있으며 팔로워 수의 변화가 페이지에 즉시 반영됩니다.

| 팔로우 & 언팔로우 |
|----------|
|![yourProfile](https://user-images.githubusercontent.com/112460466/210380853-04f2d2bd-adab-4786-a8e8-c275ce765071.gif)|

<br>

#### 3. 프로필 수정
- 사용자 프로필 이미지, 이름, 아이디, 소개 중 한 가지를 수정하면 저장 버튼이 활성화됩니다.
- 계정 ID의 유효한 형식 및 중복 검사를 통과하지 못하면 하단에 경고 문구가 나타나며 저장 버튼이 비활성화됩니다.
- 사용자 이름과 소개는 공백으로 시작할 수 없습니다.
- 프로필 수정이 완료되면 내 프로필 페이지로 이동합니다.

| 초기화면 |
|----------|
|![editProfile](https://user-images.githubusercontent.com/112460466/210381212-d67fdf87-b90c-4501-a331-f2a384534941.gif)|

<br>

### [게시글]

#### 1. 게시글 작성
- 글이 입력되거나 사진이 첨부되면 업로드 버튼이 활성화됩니다.
- 최대 세 장까지 이미지 첨부가 가능하며 첨부한 파일을 취소할 수 있습니다.
- 게시글 하단에 업로드 날짜가 표시됩니다.

| 게시글 작성 |
|----------|
|![uploadPost](https://user-images.githubusercontent.com/112460466/210381758-1de5a889-f587-41d2-b200-22c20a970519.gif)|

<br>

#### 2. 게시글 수정 및 삭제
- 자신의 게시글일 경우 모달 버튼을 통해 수정, 삭제가 가능합니다.
- 게시글 삭제 버튼 클릭 시, 게시글을 삭제하고 페이지를 리렌더링하여 삭제된 내용을 페이지에 반영합니다.
- 타 유저의 게시글일 경우 모달 버튼을 통해 신고할 수 있습니다.

| 게시글 수정 & 삭제 |
|----------|
|![editDeletePost](https://user-images.githubusercontent.com/112460466/210382021-da057943-dc21-411e-a1f8-552be0e973bf.gif)|

<br>

#### 3. 좋아요와 댓글
- 좋아요와 댓글 수는 실시간으로 상세 페이지에 반영됩니다.
- 댓글이 몇 분 전에 작성되었는지 표시됩니다.
- 자신의 댓글일 경우 모달 버튼을 통해 삭제가 가능합니다.
- 타 유저의 댓글일 경우 모달 버튼을 통해 신고할 수 있습니다.

| 좋아요 & 댓글 |
|----------|
|![likeComment](https://user-images.githubusercontent.com/112460466/210382217-01d70181-91c3-43db-a1b8-409a612afb1c.gif)|

<br>

### [상품]

#### 1. 상품 등록
- 상품 이미지, 상품명, 가격, 판매 링크를 필수로 입력해야 저장 버튼이 활성화됩니다.
- 상품 가격은 숫자만 입력할 수 있으며, 숫자를 입력하면 자동으로 원 단위로 변환됩니다.
- 상품 가격이 0원일 경우 버튼이 비활성화되며 하단에 경고 문구가 나타납니다.
- 상품명과 판매 링크는 공백으로 시작할 수 없습니다.
- 상품 등록이 완료되면 내 프로필 페이지로 이동합니다.

| 상품 등록 |
|----------|
|![addProduct](https://user-images.githubusercontent.com/112460466/210386068-c6ff2e05-eb64-4abc-b6dc-93bf52b88d3f.gif)|

<br>

#### 2. 상품 수정 및 삭제
- 상품 이미지, 상품명, 가격, 판매 링크 중 한 가지를 수정하면 저장 버튼이 활성화됩니다.
- 상품 수정이 완료되면 내 프로필 페이지로 이동합니다.
- 상품 삭제 버튼 클릭 시, 상품을 삭제하고 페이지를 리렌더링하여 삭제된 내용을 페이지에 반영합니다.

| 상품 수정 & 삭제 |
|----------|
|![editDeleteProduct](https://user-images.githubusercontent.com/112460466/210386311-5fae87a7-745f-47c0-b8e3-fc41c65cb3cb.gif)|

<br>

### [채팅]
- 채팅 목록에서 아직 읽지 않은 채팅에는 좌측 상단의 파란색 알림을 띄워줍니다.
- 채팅방에서 메시지를 입력하거나 파일을 업로드하면 전송 버튼이 활성화됩니다.
- 채팅방에서 우측 상단의 채팅방 나가기 모달 버튼을 통해 채팅 목록 페이지로 이동할 수 있습니다.
- 채팅 메시지 전송 및 수신 기능은 개발 예정입니다.

| 채팅 |
|----------|
|![chat](https://user-images.githubusercontent.com/112460466/210386478-ea4877c5-1728-4872-ab50-a8408ddf6dcd.gif)|

<br>

## 8. 트러블 슈팅

- [탭메뉴 프로필 버튼 이슈](https://github.com/likelion-project-README/README/wiki/README-8.%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_%ED%83%AD%EB%A9%94%EB%89%B4-%ED%94%84%EB%A1%9C%ED%95%84-%EB%B2%84%ED%8A%BC-%EC%9D%B4%EC%8A%88)

- [프로필 수정 이슈](https://github.com/likelion-project-README/README/wiki/README-8.%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85_%ED%94%84%EB%A1%9C%ED%95%84-%EC%88%98%EC%A0%95-%EC%9D%B4%EC%8A%88)

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
