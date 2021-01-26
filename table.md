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
    item_id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,    
    category_id varchar(255),
    name varchar(255),
    min_price int,
    buy_link varchar(255),
    img_url_big varchar(255),
    img_url_middle varchar(255),
    img_url_small varchar(255),
    likes int,
    hates int,
    description varchar(255)
);

+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| item_id        | int(11)      | NO   | PRI | NULL    | auto_increment |
| category_id    | varchar(255) | YES  |     | NULL    |                |
| name           | varchar(255) | YES  |     | NULL    |                |
| min_price      | int(11)      | YES  |     | NULL    |                |
| img_url_big    | varchar(255) | YES  |     | NULL    |                |
| img_url_middle | varchar(255) | YES  |     | NULL    |                |
| img_url_small  | varchar(255) | YES  |     | NULL    |                |
| likes          | int(11)      | YES  |     | NULL    |                |
| hates          | int(11)      | YES  |     | NULL    |                |
| description    | varchar(255) | YES  |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+

```
```mysql
CREATE TABLE recommend
(
    item_id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,    
    market varchar(255),
    price int,
    buy_url varchar(255),
    brand varchar(255),
    seller varchar(255),
    courier varchar(255)
);
+---------+--------------+------+-----+---------+-------+
| Field   | Type         | Null | Key | Default | Extra |
+---------+--------------+------+-----+---------+-------+
| item_id | varchar(255) | NO   | MUL | NULL    |       |
| market  | varchar(255) | YES  |     | NULL    |       |
| price   | int(11)      | YES  |     | NULL    |       |
| buy_url | int(11)      | YES  |     | NULL    |       |
| brand   | varchar(255) | YES  |     | NULL    |       |
| seller  | varchar(255) | YES  |     | NULL    |       |
| courier | varchar(255) | YES  |     | NULL    |       |
+---------+--------------+------+-----+---------+-------+
```


# ForTests

## category
```mysql
insert into category values('d0000', '디지털/가전', 'root');
insert into category values('d00001', '계절가전', 'd0000');
insert into category values('d000011', '에어컨', 'd00001');
insert into category values('d000011', '냉풍기', 'd00001');
insert into category values('d000011', '제습기', 'd00001');
insert into category values('d000011', '가습기', 'd00001');
insert into category values('d000011', '공기청정기', 'd00001');
insert into category values('d00002', '생활가전', 'd0000');
insert into category values('d000021', '세탁기', 'd00002');
insert into category values('d000022', '청소기', 'd00002');
insert into category values('d000023', '다리미', 'd00002');
insert into category values('d000024', '도어록', 'd00002');
insert into category values('d00003', '주방가전', 'd0000');
insert into category values('d000031', '냉장고', 'd00003');
insert into category values('d000032', '가스레인지', 'd00003');
insert into category values('d000033', '전기밥솥', 'd00003');
insert into category values('d000034', '커피메이커', 'd00003');
insert into category values('d00004', '음향가전', 'd0000');
insert into category values('d000041', '홈시어터', 'd00004');
insert into category values('d000042', '이어폰', 'd00004');
insert into category values('d000043', '헤드폰', 'd00004');
insert into category values('d000044', '블루투스셋', 'd00004');
insert into category values('d00005', '영상가전', 'd0000');
insert into category values('d00006', 'PC주변기기', 'd0000');
insert into category values('d00007', '저장장치', 'd0000');
insert into category values('d00008', '이미용가전', 'd0000');
insert into category values('d00009', '게임/타이틀', 'd0000');
insert into category values('d000091', '가정용 게임기', 'd00009');
insert into category values('d000092', '휴대용 게임기', 'd00009');
insert into category values('d000093', '게임 타이틀', 'd00009');
insert into category values('d000094', 'PC 게임', 'd00009');
insert into category values('d00010', 'PC부품', 'd0000');
insert into category values('d00011', '네트워크장비', 'd0000');
insert into category values('d00012', '자동차기기', 'd0000');
```

## item
```mysql
insert into items2 values(NULL, "d000091", "닌텐도Switch", "Coupang", 200000, "https://www.costco.co.kr/medias/sys_master/images/h05/h2c/26922555506718.jpg", "https://www.costco.co.kr/medias/sys_master/images/h05/h2c/26922555506718.jpg", "https://www.costco.co.kr/medias/sys_master/images/h05/h2c/26922555506718.jpg", 55, 1, "닌텐도 스위치 짱");
insert into items2 values(NULL, "d000091", "PlayStation5", "Coupang", 250000, "https://www.joseilbo.com/gisa_img_origin/15858861591585886159_peacetech_origin.jpg", "https://www.joseilbo.com/gisa_img_origin/15858861591585886159_peacetech_origin.jpg", "https://www.joseilbo.com/gisa_img_origin/15858861591585886159_peacetech_origin.jpg", 45, 1, "Playstation whatever");
insert into recommend values(1, "Coupang", 990000, "https://sony.com", "Sony", "Sony", "CJ 대한통운");
insert into recommend values(2, "Coupang", 360000, "https://nitendo.com", "Nintendo", "Nintendo", "한진택배");
```

## comments
```mysql
insert into comments values('comments12345', 12345, 'itemId12344', '플스 가 신발보다 싸다', 15,0);
```
