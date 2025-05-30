let currentPage = 1;
const itemsPerPage = 10;
let displayedItems = 0;
let goodsResults = [];
let filteredGoods = [];
let sortedGoods = {
    priceHigh: [],
    priceLow: [],
    likeHigh: [],
    replyHigh: [],
    newDate: []
};
let selectedCategories = [];
searchText = localStorage.getItem('searchText') || '';

selectCat.style.display = "none";

categorySelect.addEventListener("click", () => {
    if (selectCat.style.display === "none") {
        selectCat.style.display = "flex";
    } else {
        selectCat.style.display = "none";
    }
});

function handleSortButton(sortButton) {
    const sortType = sortButton.id;

    if (sortButton.classList.contains('active')) {
        document.querySelectorAll('.searchCategory span').forEach(button => button.classList.remove('active'));
        filteredGoods = searchText ? goodsResults.filter(item => item.gname.includes(searchText)) : goodsResults;
    } else {
        filteredGoods = searchText ? goodsResults.filter(item => item.gname.includes(searchText)) : goodsResults;
        filteredGoods = sortGoodsByCriteria(filteredGoods, sortType);
        document.querySelectorAll('.searchCategory span').forEach(button => button.classList.remove('active'));
        sortButton.classList.add('active');
    }

    currentPage = 1;
    displayedItems = 0;
    document.getElementById("goodsContainer").innerHTML = "";
    displayItems();
    setMoreButtonVisibility();
}

function sortGoodsByCriteria(goodsItems, sortType) {
    return goodsItems.slice().sort((a, b) => {
        let aValue, bValue;
        switch (sortType) {
            case 'priceHigh':
                aValue = parseInt(a.gprice);
                bValue = parseInt(b.gprice);
                return bValue - aValue;
            case 'priceLow':
                aValue = parseInt(a.gprice);
                bValue = parseInt(b.gprice);
                return aValue - bValue;
            case 'likeHigh':
                aValue = parseInt(a.likeCount);
                bValue = parseInt(b.likeCount);
                return bValue - aValue;
            case 'replyHigh':
                aValue = parseInt(a.replycnt);
                bValue = parseInt(b.replycnt);
                return bValue - aValue;
            case 'newDate':
                aValue = new Date(a.sellDate);
                bValue = new Date(b.sellDate);
                return bValue - aValue;
        }
    });
}

function handleCategoryFilter(filterButton) {
    const categoryId = filterButton.id;

    if (categoryId === 'allCategory') {
        selectedCategories = [];
        document.querySelectorAll('.categoryFilter').forEach(btn => btn.classList.remove('active'));
        filterButton.classList.add('active');
        filteredGoods = searchText ? goodsResults.filter(item => item.gname.includes(searchText)) : goodsResults;
    } else {
        if (selectedCategories.includes(categoryId)) {
            selectedCategories = selectedCategories.filter(cat => cat !== categoryId);
            filterButton.classList.remove('active');
        } else {
            selectedCategories.push(categoryId);
            filterButton.classList.add('active');
        }
        document.querySelector('#allCategory').classList.remove('active');
        filterGoodsBySearchAndCategory(goodsResults, searchText, selectedCategories);
    }

    currentPage = 1;
    displayedItems = 0;
    document.getElementById("goodsContainer").innerHTML = "";
    displayItems();
    setMoreButtonVisibility();
}

function filterGoodsBySearchAndCategory(goodsItems, searchText, selectedCategories) {
    filteredGoods = goodsItems.filter(item => {
        const matchesSearch = !searchText || item.gname.includes(searchText);
        const matchesCategory = selectedCategories.length === 0 || selectedCategories.some(category => item.gcat[category]);
        return matchesSearch && matchesCategory;
    });
    displayedItems = 0;
}

function displayItems() {
    const goodsContainer = document.getElementById("goodsContainer");
    const startIndex = (currentPage - 1) * itemsPerPage;
    const endIndex = startIndex + itemsPerPage;
    
    if (filteredGoods.length === 0) {
        const noResultMessage = document.createElement("div");
        noResultMessage.classList.add("noResultMessage");
        noResultMessage.textContent = "검색 결과가 없습니다.";
        goodsContainer.appendChild(noResultMessage);
        setMoreButtonVisibility();
        return;
    }

    const fragment = document.createDocumentFragment();
    const itemsToShow = filteredGoods.slice(startIndex, endIndex);

    itemsToShow.forEach(item => {
        fragment.appendChild(createGoodsElement(item));
    });

    goodsContainer.appendChild(fragment);
    displayedItems += itemsToShow.length;
    setLink();
}

document.addEventListener('DOMContentLoaded', () => {
    setLink();
    document.getElementById('allCategory').classList.add('active');

    fetch('/goodsStore/getAllGoodsList', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => response.json())
    .then(data => {
        goodsResults = data.map(item => {
            if (item.gname.length > 20) {
                item.gname = item.gname.substring(0, 20) + '...';
            }
            if (item.gexp.length > 40) {
                item.gexp = item.gexp.substring(0, 40) + '...';
            }
            return item;
        });
        
        sortedGoods.priceHigh = sortGoodsByCriteria(goodsResults, 'priceHigh');
        sortedGoods.priceLow = sortGoodsByCriteria(goodsResults, 'priceLow');
        sortedGoods.likeHigh = sortGoodsByCriteria(goodsResults, 'likeHigh');
        sortedGoods.replyHigh = sortGoodsByCriteria(goodsResults, 'replyHigh');
        sortedGoods.newDate = sortGoodsByCriteria(goodsResults, 'newDate');
        
        searchText = localStorage.getItem('searchText') || '';
        filteredGoods = searchText ? goodsResults.filter(item => item.gname.includes(searchText)) : goodsResults;

        displayItems();
        setMoreButtonVisibility();

        document.querySelectorAll('.categoryFilter').forEach(filterButton => {
            filterButton.addEventListener('click', () => {
                handleCategoryFilter(filterButton);
            });
        });

           const scrollUpButton = document.getElementById("scrollUp");
           const scrollDownButton = document.getElementById("scrollDown");

           // 최상단으로 스크롤
           function scrollToTop() {
               window.scrollTo({ top: 0, behavior: 'smooth' });
           }

           // 최하단으로 스크롤
           function scrollToBottom() {
               window.scrollTo({ top: document.body.scrollHeight, behavior: 'smooth' });
           }

           // 스크롤 상태에 따라 버튼 보이기/숨기기 설정
           function checkScrollPosition() {
               if (window.scrollY === 0) {
                   scrollUpButton.style.display = 'none'; // 위 버튼 숨기기
                   scrollDownButton.style.display = 'block'; // 아래 버튼 보이기
               } else if (window.innerHeight + window.scrollY >= document.body.offsetHeight) {
                   scrollUpButton.style.display = 'block'; // 위 버튼 보이기
                   scrollDownButton.style.display = 'none'; // 아래 버튼 숨기기
               } else {
                   scrollUpButton.style.display = 'block'; // 위 버튼 보이기
                   scrollDownButton.style.display = 'block'; // 아래 버튼 보이기
               }
           }

           // 버튼에 클릭 이벤트 리스너 추가
           scrollUpButton.addEventListener("click", scrollToTop);
           scrollDownButton.addEventListener("click", scrollToBottom);

           // 버튼 호버 시 불투명도 변경
           scrollUpButton.addEventListener("mouseenter", function() {
               scrollUpButton.style.opacity = 1; // 호버 시 불투명도 1로 설정
           });
           scrollUpButton.addEventListener("mouseleave", function() {
               if (window.scrollY !== 0) {
                   scrollUpButton.style.opacity = 0.5; // 호버를 떼면 불투명도 0.5로 설정
               }
           });

           scrollDownButton.addEventListener("mouseenter", function() {
               scrollDownButton.style.opacity = 1; // 호버 시 불투명도 1로 설정
           });
           scrollDownButton.addEventListener("mouseleave", function() {
               if (window.innerHeight + window.scrollY < document.body.offsetHeight) {
                   scrollDownButton.style.opacity = 0.5; // 호버를 떼면 불투명도 0.5로 설정
               }
           });

           // 페이지 로드 및 스크롤 시 버튼 상태 업데이트
           window.addEventListener("scroll", checkScrollPosition);
           checkScrollPosition(); // 초기 로딩 시 상태 설정

        document.querySelectorAll('.searchCategory span').forEach(sortButton => {
            sortButton.addEventListener('click', () => {
                handleSortButton(sortButton);
            });
        });

        document.querySelector("#loadMoreBtn").addEventListener('click', () => {
            currentPage++;
            displayItems();
            setMoreButtonVisibility();
        });
    })
    .catch(error => {
        console.error('Error fetching goods:', error);
    });
});

function createGoodsElement(item) {
    const goodsResult = document.createElement('div');
    goodsResult.classList.add('goodsResult');

    const formattedSellDate = displayTime(item.sellDate); // sellDate를 displayTime 함수로 변환

    goodsResult.innerHTML = `
        <div class="goodsImg"></div>
        <div class="goodsInfo">
            <input type="hidden" value="${item.gno}">
            <input type="hidden" class="goodsReply" value="${item.replycnt}">
            <input type="hidden" value="${item.attachList[0].uuid}_${item.attachList[0].fileName}" id="fileName">
            <div class="goodsLike">❤️ ${item.likeCount}</div>
            <div class="goodsName">상품명: ${item.gname}</div>
            <div class="goodsPrice">가격: ${item.gprice} 원</div>
            <div class="goodsExp">설명: ${item.gexp}</div>
            <div class="goodsSellDate">판매종료일 : ${formattedSellDate}</div>
            <div class="goodsCategory">
                <span class="categories">
                    ${item.gcat.healthBeauty ? '건강 & 뷰티' : ''}
                    ${item.gcat.game ? '게임' : ''}
                    ${item.gcat.culture ? '문화' : ''}
                    ${item.gcat.shopping ? '쇼핑' : ''}
                    ${item.gcat.supply ? '문구' : ''}
                    ${item.gcat.kids ? '키즈' : ''}
                    ${item.gcat.design ? '디자인' : ''}
                    ${item.gcat.foods ? '식품' : ''}
                    ${item.gcat.interior ? '인테리어' : ''}
                    ${item.gcat.policy ? '정책' : ''}
                    ${item.gcat.character ? '캐릭터' : ''}
                    ${item.gcat.experience ? '체험' : ''}
                    ${item.gcat.collaboration ? '콜라보' : ''}
                    ${item.gcat.entertainment ? '방송' : ''}
                </span>
            </div>
        </div>
    `;

    setBackgroundImage(goodsResult.querySelector('.goodsImg'));

    return goodsResult;
}

document.getElementById("init").addEventListener('click', (e) => {
    localStorage.setItem('searchText', '');
    searchText = '';

    selectedCategories = [];
    document.querySelectorAll('.categoryFilter').forEach(btn => btn.classList.remove('active'));
    document.getElementById('allCategory').classList.add('active');
    
    document.querySelectorAll('.searchCategory span').forEach(button => {
        button.classList.remove('active');
    });
    
    const searchedText = document.getElementById('goodsSearchBox');
    searchedText.placeholder = '검색할 굿즈 이름을 입력하세요';
    
    filteredGoods = goodsResults.slice();

    currentPage = 1;
    displayedItems = 0;

    document.getElementById("goodsContainer").innerHTML = "";
    displayItems();
    setMoreButtonVisibility();
});

function setBackgroundImage(item) {
    const fileName = item.closest('.goodsResult').querySelector("#fileName").value;

    const loadImage = () => {
        fetch(`/goodsStore/goodsBannerImages/${encodeURIComponent(fileName)}`)
            .then(response => response.blob())
            .then(blob => {
                const imageUrl = URL.createObjectURL(blob);
                item.style.backgroundImage = `url(${imageUrl})`;
                item.style.backgroundSize = "cover";
                item.style.backgroundPosition = "center center";
                item.style.backgroundRepeat = "no-repeat";
            })
            .catch(error => {
                console.error(error);
            });
    };

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                loadImage();
                observer.unobserve(item);
            }
        });
    });
    observer.observe(item);
}

function setMoreButtonVisibility() {
    const moreButton = document.getElementById("loadMoreBtn");
    if (displayedItems >= filteredGoods.length) {
        moreButton.style.display = 'none';
    } else {
        moreButton.style.display = 'block';
    }
}

function setLink() {
    document.querySelectorAll('.goodsResult').forEach(item => {
        item.addEventListener('click', () => {
            const gno = item.querySelector('input[type="hidden"]').value;
            location.href = `/goodsStore/goodsDetails?gno=${gno}`;
        });
    });
}
function displayTime(unixTimeStamp) {
    const myDate = new Date(unixTimeStamp);
    const y = myDate.getFullYear();
    const m = String(myDate.getMonth() + 1).padStart(2, '0');
    const d = String(myDate.getDate()).padStart(2, '0');
    return `${y}-${m}-${d}`;
}