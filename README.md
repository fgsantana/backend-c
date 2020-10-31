# backend-c


#### 1 - Prints depending on the number's property.
```
    static void fizzingNBuzzing() {
        int i = 1;
        while (i <= 100) {
            if (!(i % 3 == 0 || i % 5 == 0)) {
                System.out.print(i);
            }
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println();
            i++;
        }
    }

}
```

#### 2 - Verifies the number of stars of each element.
```
static int angryMarvinBirds(String[] results) {
        int stars = 0;
        for (String stage : results) {
            stars += countStars(stage);
        }
        return stars;
    }

    static int countStars(String stage) {
        int total = 0;
        for (char c : stage.toCharArray()) {
            if (c == '*') {
                total++;
            }
        }
        return total;
    }
```
Example:
> String[] results = {"****", "*---", "**-"};

> angryMarvinBirds(results);

#### 3 - Verifies if each moment matches any pattern. 
```
  static int creepyHours(String[] moments) {
        int total = 0;
        for (String moment : moments) {
            if (creepy(moment)) {
                total++;
            }
        }
        return total;

    }

   static boolean creepy(String moment) {
        char[] left = moment.split(":")[0].toCharArray();
        char[] right = moment.split(":")[1].toCharArray();
        return (left[0] == right[1] && left[1] == right[0]) || (left[0] == right[0] && left[1] == right[1] ||
                (left[0] == left[1] && right[0] == right[1]));
    }
```
Example:
> String[] moments = {"22:22", "12:21", "07:30"};

> creepyHours(moments);

#### 4 - Takes the numbers of wins and ties in the corresponding element and computes. Input example:
```
 static int champion(int[] wins, int[] ties) {
        int[] points = new int[ties.length];
        for (int i = 0; i < points.length; i++) {
            points[i] = (3 * wins[i]) + (ties[i]);

        }
        int greater = points[0];
        for (int i = 1; i < points.length; i++) {
            if (points[i] > greater) {
                greater = points[i];
            }
        }
        return greater;
    }
```    

Example:
> int[] wins = {1,0,3};

> int[] ties = {2,2,0};

> champion(wins,ties);

#### 5 - Has two type of queries (depending on the way the table was created)

1. Query on a table that store order with the informations Order ID, Total price of the order and Customer name
```
SELECT orderid,totalprice FROM orders WHERE customername='DeathStar'
```
2. Query on a table that store product with the informations Product name (not used on the query), the Order ID associated with the product, the price of the product and the customer name
```
SELECT orderid, SUM(price) as totalprice FROM orders WHERE customername='DeathStar' GROUP BY orderid
 ```


### [Code with print](https://github.com/fgsantana/backend-c/tree/main/code)
- 6- REST API usign Feign Client to consume external web service. Returning only the relevant data. [More information](https://github.com/fgsantana/backend-c/tree/main/formula1-api) 