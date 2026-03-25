create materialized view books_stats_mv as
select
    b.category as category,
    count(*) as total_books,
    sum(b.available_copies) as total_available_copies,
    count(*) filter (where b.state <> 'GOOD') as not_good_condition_books
from books as b
group by b.category;

create unique index idx_books_stats_mv_category
    on books_stats_mv(category);