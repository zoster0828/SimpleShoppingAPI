# TABLE SCHEMA

```mysql
CREATE TABLE category
(
    categoryId varchar(255) primary key,
    subject varchar(255),
    parentCategoryId varchar(255)
);
```

```mysql
CREATE TABLE comments
(
    commentsId varchar(255) primary key,
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
    itemId varchar(255) primary key,
    categoryId varchar(255),
    subject varchar(255),
    market varchar(255),
    price int,
    buylink varchar(255),
    imageLinkBig varchar(255),
    imageLinkMiddle varchar(255),
    imageLinkSmall varchar(255),
    likes int,
    hates int,
    brand varchar(255),
    seller varchar(255),
    courier varchar(255),
    remain int,
    description varchar(255)
);
```