USE EMPLOYEE_SCHEMA;

-- Find the names of employees who work in the same department as 'John'
SELECT e2.EMPLOYEE_NAME 
FROM EMPLOYEES e1
JOIN EMPLOYEES e2 ON e1.DEPARTMENT_ID = e2.DEPARTMENT_ID
WHERE e1.EMPLOYEE_NAME = 'John' AND e2.EMPLOYEE_NAME!= 'John';


-- Find departments that have more than one employee
SELECT d.DEPARTMENT_NAME
FROM DEPARTMENTS d
JOIN EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_ID, d.DEPARTMENT_ID
HAVING COUNT(e.EMPLOYEE_ID) > 1;


-- Find the projects that are not assigned to any department
SELECT PROJECT_NAME
FROM PROJECTS
WHERE DEPARTMENT_ID IS NULL;


-- Find the department with the maximum number of employees.
SELECT d.DEPARTMENT_ID
FROM DEPARTMENTS d
JOIN EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_ID, d.DEPARTMENT_NAME
ORDER BY COUNT(e.EMPLOYEE_ID) DESC
LIMIT 1;


-- Find employees who are working on projects in the 'Sales' department.
SELECT e.EMPLOYEE_NAME
FROM EMPLOYEES e
JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
JOIN PROJECTS p ON d.DEPARTMENT_ID = p.DEPARTMENT_ID
WHERE d.DEPARTMENT_NAME = 'Sales';


-- Find the names of departments that do not have any projects.
SELECT d.DEPARTMENT_NAME
FROM DEPARTMENTS d
LEFT JOIN PROJECTS p ON d.DEPARTMENT_ID = p.DEPARTMENT_ID
WHERE p.PROJECT_ID IS NULL;


-- Find employees who are not working on any project.
SELECT e.EMPLOYEE_NAME
FROM EMPLOYEES e
LEFT JOIN PROJECTS p ON e.DEPARTMENT_ID = p.DEPARTMENT_ID
WHERE p.PROJECT_ID IS NULL;


-- Find the department names and the number of employees in each department, only for departments with more than two employees.
SELECT d.DEPARTMENT_NAME, COUNT(e.EMPLOYEE_ID) AS NUMBER_OF_EMPLOYEES
FROM DEPARTMENTS d
JOIN EMPLOYEES e ON d.DEPARTMENT_ID = e.DEPARTMENT_ID
GROUP BY d.DEPARTMENT_ID, d.DEPARTMENT_NAME
HAVING COUNT(e.EMPLOYEE_ID) > 2;


-- Find the projects handled by employees in the 'IT' department.
SELECT p.PROJECT_NAME
FROM PROJECTS p
JOIN DEPARTMENTS d ON p.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE d.DEPARTMENT_NAME = 'IT';


-- Find the names of employees who do not work in the 'Marketing' department.
SELECT e.EMPLOYEE_NAME
FROM EMPLOYEES e
JOIN DEPARTMENTS d ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE d.DEPARTMENT_ID!= 'Marketing';

