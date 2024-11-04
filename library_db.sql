CREATE TABLE Books (
    book_id INT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255),
    available BOOLEAN DEFAULT TRUE
);

CREATE TABLE Members (
    member_id INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE LendingHistory (
    lend_id INT PRIMARY KEY,
    book_id INT,
    member_id INT,
    lend_date DATE,
    return_date DATE
);
