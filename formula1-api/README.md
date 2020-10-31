## formula1-api

#### The API receives the season (year) and round as path variables in the endpoints(/api/v1/season/round), consumes external API, get the JSON and returns relevant data. If another path variable is specified (/api/v1/season/round/position), the API returns the driver at the specified position.

#### Also has an endpoint to retrieve all races of a specific year (/api/v1/season). In this case its possible to send parameters in the request about pagination (size, page). If no size is specified, the default is 30. If no page is specified, the default is 0 (first). The limit (elements per page) on the endpoint season/round of the external API is set to 50, always retrieving all results.

##### Examples of request:
> [Round 2 of season 1970](http://ec2-54-242-62-5.compute-1.amazonaws.com:8080/api/v1/1970/2)

> [All races season 2010](http://ec2-54-242-62-5.compute-1.amazonaws.com:8080/api/v1/2010?size=50&page=3) (here the size of a page is set to 50 and the requested page is 3)

> [All races season 2022](http://ec2-54-242-62-5.compute-1.amazonaws.com:8080/api/v1/2022) (there is no races yet, so the result list is empty)

> [Season 2017, Round 1, Driver at position 4](http://ec2-54-242-62-5.compute-1.amazonaws.com:8080/api/v1/2017/1/4) (driver in the position 4 of the round 7 in the season 2017)

> [Season 2017, Round 7, Driver at position 50](http://ec2-54-242-62-5.compute-1.amazonaws.com:8080/api/v1/2017/7/50) (this race doesn't have this position, an error "PositionNotInRace" is returned)



- Spring Boot
- Spring Web
- Spring Cloud
  - OpenFeign (HTTP Client)
- Lombok (boilerplate reduction)
- Maven