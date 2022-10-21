CREATE TABLE post
(
    id      INTEGER AUTO_INCREMENT PRIMARY KEY,
    title   VARCHAR(300) NOT NULL,
    content VARCHAR(5000) NULL,
    created TIMESTAMP
);

CREATE TABLE comment
(
    id      INTEGER AUTO_INCREMENT PRIMARY KEY,
    post_id INTEGER NOT NULL,
    content VARCHAR(1500) NULL,
    created TIMESTAMP
);

ALTER TABLE comment
    ADD CONSTRAINT comment_post_id
        FOREIGN KEY (post_id) REFERENCES post (id)
