# Write your MySQL query statement below
DELETE P
FROM Person P
JOIN Person P1
ON P.email = P1.email
WHERE P.id>P1.id;