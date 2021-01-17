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
    itemId varchar(255),
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