/* Write your PL/SQL query statement below */
SELECT c.name as Customers
FROM customers c 
LEFT JOIN
Orders o
ON c.id = o.customerId
WHERE O.customerId IS NULL;