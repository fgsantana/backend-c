## formula1-api

#### The API receives the season (year) and round as path variables in the URI, consumes external API, get the JSON and returns relevant data. Also has an endpoint to retrieve all races of a specific year. In this case its possible to send parameters about pagination (size, page). If no size is specified, the default is 30. If no page is specified, the default is 1. The limit (elements per page) on the endpoint season/round of the external API was set to 50, always retrieving all results.

- Spring Boot
- Spring Web
- Spring Cloud
  - OpenFeign (HTTP Client)
- Lombok (boilerplate reduction)