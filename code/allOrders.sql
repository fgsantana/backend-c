--The table stores order (simpler query, here the table insert the order with its total price, orderid and customer)

SELECT orderid,totalprice FROM orders WHERE customername='DeathStar'

--The table stores product order (in this case every product order we insert has its price, customer and order associated)

SELECT orderid, SUM(price) as totalprice FROM orders WHERE customername='DeathStar' GROUP BY orderid


