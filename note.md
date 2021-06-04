##### user表
```sql
CREATE TABLE USER(
	id INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(20),
	PASSWORD VARCHAR(20),
	phone VARCHAR(20)
)
```

##### hero表 (编号、中文名、英文名、别名、性别、价格、定位、地区)
```sql 

CREATE TABLE hero(
	id INT PRIMARY KEY AUTO_INCREMENT,
	cnName VARCHAR(20),
	enName VARCHAR(20),
	alias VARCHAR(20),
	sex INT,
	price VARCHAR(20),
	gps VARCHAR(20),
	place VARCHAR(20)
)
```