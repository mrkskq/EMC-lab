insert into book_copies (created_at, updated_at, book_id, state, available)
values
    (now(), now(), (select id from books where name = 'The Shining'), 'GOOD', true),
    (now(), now(), (select id from books where name = 'The Shining'), 'GOOD', true),

    (now(), now(), (select id from books where name = 'It'), 'GOOD', true),
    (now(), now(), (select id from books where name = 'It'), 'GOOD', false),

    (now(), now(), (select id from books where name = '1984'), 'GOOD', true),
    (now(), now(), (select id from books where name = '1984'), 'GOOD', true),
    (now(), now(), (select id from books where name = '1984'), 'GOOD', false),

    (now(), now(), (select id from books where name = 'Animal Farm'), 'GOOD', true),
    (now(), now(), (select id from books where name = 'Animal Farm'), 'GOOD', true),

    (now(), now(), (select id from books where name = 'War and Peace'), 'BAD', false),
    (now(), now(), (select id from books where name = 'War and Peace'), 'BAD', false),

    (now(), now(), (select id from books where name = 'Anna Karenina'), 'GOOD', true),
    (now(), now(), (select id from books where name = 'Anna Karenina'), 'GOOD', true),
    (now(), now(), (select id from books where name = 'Anna Karenina'), 'GOOD', false),

    (now(), now(), (select id from books where name = 'One Hundred Years of Solitude'), 'GOOD', true),
    (now(), now(), (select id from books where name = 'One Hundred Years of Solitude'), 'GOOD', true),

    (now(), now(), (select id from books where name = 'Norwegian Wood'), 'GOOD', true),
    (now(), now(), (select id from books where name = 'Norwegian Wood'), 'GOOD', false),

    (now(), now(), (select id from books where name = 'Kafka on the Shore'), 'BAD', false);