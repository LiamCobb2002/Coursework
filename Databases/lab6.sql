--Author: Liam Cobb

select count(*) from M_MOVIES;

select genre, count(*) as "number of movies"
from M_MOVIES
group by genre;

select rating, count(*) as "number of movies"
from m_movies 
group by rating
order by rating;

select max(score) as "max score"
from m_movies ;

select mtitle as "highest movie"
from m_movies 
where score = (select max(score) from m_movies);

select mtitle as "lowest movie"
from m_movies 
where score = (select min(score) from m_movies);

select genre, count(*) as "number of movies" 
from m_movies 
group by genre
having count(*) > 15;
