# TABLE SCHEMA

```mysql
CREATE TABLE category
(
    category_id varchar(255) primary key,
    subject varchar(255),
    parent_category_id varchar(255)
);
```

```mysql
CREATE TABLE comments
(
    comments_id varchar(255) primary key,
    timestamp bigint,
    item_id varchar(255),
    text varchar(255),
    likes int,
    hates int
);
```

```mysql
CREATE TABLE items
(
    item_id varchar(255) primary key,
    category_id varchar(255),
    subject varchar(255),
    market varchar(255),
    price int,
    buy_link varchar(255),
    image_link_big varchar(255),
    image_link_middle varchar(255),
    image_link_small varchar(255),
    likes int,
    hates int,
    brand varchar(255),
    seller varchar(255),
    courier varchar(255),
    remain int,
    description varchar(255)
);
```



# ForTests

## category
```mysql
insert into category values('c1', '전자기기', 'root');
insert into category values('c2', '일회용품', 'root');
```

## item
```mysql
insert into items values("itemId12345", "c1", "닌텐도Switch", "Coupang", 520000, "http://coupang.com", "s3://abc.com", "s3://abc.com", "s3://abc.com", 55, 1, "Nintendo", "한국 닌텐도", "CJ 대한통운", 15, "닌텐도 스위치 짱");
insert into items values("itemId12344", "c1", "PlayStation5", "Coupang", 420000, "http://coupang.com", "s3://abc.com", "s3://abc.com", "s3://abc.com", 45, 1, "Sony", "한국 Sony", "CJ 대한통운", 15, "Playstation what ever");
```

## comments
```mysql
insert into comments values('comments12345', 12345, 'itemId12344', '플스 가 신발보다 싸다', 15,0);
```
