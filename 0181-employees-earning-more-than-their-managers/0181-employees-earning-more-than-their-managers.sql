# Write your MySQL query statement below
SELECT e2.name as Employee
FROM employee e1
JOIN employee e2
ON e1.Id = e2.managerId
WHERE e1.salary<e2.salary