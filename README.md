# SimpleShoppingAPI

# API List
## getCategoryList
> category List를 불러오는 API
### method
> GET
#### params
#### headers
#### request example
#### response example
```json
[
  {
    "categoryId": "c12345",
    "subject": "닌텐도Switch",
    "parentCategoryId": "c123"
  },
  {
    "categoryId": "c123",
    "subject": "전자기기",
    "parentCategoryId": "root"
  }
]
```
---
## getItem
> item의 상세정보를 불러오는 API, 최대 10개의 comments를 같이 읽어옴
### method
> GET
#### params
> itemId
#### headers
#### request example
#### response example
```json
{
  "categoryId": "c12345",
  "itemId": "ffasdccwty3412aa23",
  "subject": "닌텐도Switch",
  "market": "coupang",
  "price": 26000,
  "buyLink": "http://somewhere.in.the.world",
  "imageLink": {
      "big": "http://imageLink.com",
      "middle": "http://imageLink.com",
      "small": "http://imageLink.com"
  } ,
  "like": 0,
  "hate": 0,
  "brand": "닌텐도",
  "seller": "태경몰",
  "courier": "CJ 대한통운",
  "remain": 15,
  "description": "Coupang에서 진행하는 12월 우수상품",
  "comments": [
                  {
                      "commentsId": "comments1123145",
                      "timeStamp": 123456789,
                      "itemId": "ffasdccwty3412aa23",
                      "text": "마리오가 재밌어요",
                      "like": 0,
                      "hate": 0
                  },
                  {
                      "commentsId": "comments1123145",
                      "timeStamp": 123456789,
                      "itemId": "ffasdccwty3412aa23",
                      "text": "여기가 제일 쌈",
                      "like": 0,
                      "hate": 0
                  },
                  {
                      "commentsId": "comments1123145",
                      "timeStamp": 123456789,
                      "itemId": "ffasdccwty3412aa23",
                      "text": "공식 판매처 입니다.",
                      "like": 0,
                      "hate": 0
                  }
              ]
}
```

---
## getListFromCategory
> Category 하위의 itemList를 가지고 오는 API, 최하위 CategoryID로만 호출 할 수 있음
### method
> GET
#### params
> categoryId
#### headers
#### request example
#### response example
```json
[
  {
     "categoryId": "c12345",
     "itemId": "ffasdccwty3412aa23",
     "subject": "닌텐도Switch",
     "market": "coupang",
     "price": 26000,
     "buyLink": "http://somewhere.in.the.world",
     "imageLink": {
         "big": "http://imageLink.com",
         "middle": "http://imageLink.com",
         "small": "http://imageLink.com"
     } 
  },
  {
     "categoryId": "c12345",
     "itemId": "ffasdccwty3412aa23",
     "subject": "PlasyStation5",
     "market": "11st",
     "price": 52000,
     "buyLink": "http://somewhere.in.the.world",
     "imageLink": {
         "big": "http://imageLink.com",
         "middle": "http://imageLink.com",
         "small": "http://imageLink.com"
     } 
  }
]
```
---
## getComments
### method
> GET
#### params
> itemId
#### headers
#### request example
#### response example
```json
[
  {
      "commentsId": "comments1123145",
      "timeStamp": 123456789,
      "itemId": "coupang",
      "text": "마리오가 재밌어요",
      "like": 0,
      "hate": 0
  },
  {
      "commentsId": "comments1123145",
      "timeStamp": 123456789,
      "itemId": "coupang",
      "text": "유용합니다.",
      "like": 0,
      "hate": 0
  }
]
```