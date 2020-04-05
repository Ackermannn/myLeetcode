# https://leetcode-cn.com/problems/employees-earning-more-than-their-managers/
# Write your MySQL query statement below
select a.name as Employee
from Employee as a
join Employee as b
on a.ManagerId = b.Id and a.Salary > b.Salary;
