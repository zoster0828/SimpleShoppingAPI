# SimpleShoppingAPI

## API List
### getCategoryList
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
    "subject": "전자기기",
    "parentCategoryId": "c123"
  },
  {
    "categoryId": "c12345",
    "subject": "전자기기",
    "parentCategoryId": "root"
  }
]
```
---
### getItem
> item의 상세정보를 불러오는 API
### method
> GET
#### params
#### headers
#### request example
#### response example
```json
{
  "categoryId": "c12345",
  "subject": "닌텐도Switch",
  "market": "coupang",
  "price": 26000,
  "buyLink": "http://somewhere.in.the.world",
  "imageLink": {
      "big": "http://imageLink.com",
      "middle": "http://imageLink.com",
      "small": "http://imageLink.com"
  } 
}
```

---
### getCategoryList
### method
> GET
#### params
#### headers
#### request example
#### response example

---
### getCategoryList
### method
> GET
#### params
#### headers
#### request example
#### response example