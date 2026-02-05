-- Assignment 3: PostgreSQL database

-- Create users table
CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       email VARCHAR(100) UNIQUE NOT NULL
);

-- Create posts table
CREATE TABLE posts (
                       id SERIAL PRIMARY KEY,
                       content TEXT NOT NULL,
                       user_id INT REFERENCES users(id) ON DELETE CASCADE
);

-- Insert users
INSERT INTO users (name, email)
VALUES
    ('Alice', 'alice@mail.com'),
    ('Bob', 'bob@mail.com');

-- Insert posts
INSERT INTO posts (content, user_id)
VALUES
    ('Hello world', 1),
    ('Java is cool', 1);

-- Read data
SELECT * FROM users;
SELECT * FROM posts;

-- Update
UPDATE users SET name = 'Alice Updated' WHERE id = 1;

-- Delete
DELETE FROM posts WHERE id = 2;
