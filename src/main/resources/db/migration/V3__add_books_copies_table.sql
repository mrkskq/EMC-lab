CREATE TABLE book_copies (
    id bigserial PRIMARY KEY,
    created_at timestamp NOT NULL,
    updated_at timestamp NOT NULL,
    book_id bigint NOT NULL REFERENCES books(id),
    state varchar(255) NOT NULL,
    available boolean NOT NULL DEFAULT true
);