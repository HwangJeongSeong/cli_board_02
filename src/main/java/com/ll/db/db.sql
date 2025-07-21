DROP DATABASE IF EXISTS proj1;
CREATE DATABASE proj1;
USE proj1;

CREATE TABLE article (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    subject VARCHAR(100) NOT NULL,
    content TEXT NOT NULL,
    regDate DATETIME NOT NULL DEFAULT NOW(),
    UNIQUE (subject)
);

INSERT INTO article (subject, content)
VALUES
    ('test1', '게시글 내용 1'),
    ('test2', '게시글 내용 2'),
    ('test3', '게시글 내용 3');
