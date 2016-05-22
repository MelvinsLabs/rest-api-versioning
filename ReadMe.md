
# ReadMe

This Project demonstrates various ways to version the REST API.

## Strategies

1. URL Based Version

 In this approach, the version is mentioned in the URL and thus the endpoint.
 
 Example:
 
 `http://localhost:8181/Api/Op/v1`
 
 `http://localhost:8181/Api/Op/v2`
 
 _Pros_
 
 - Browser friendly.
 
 _Cons_
 
 - The endpoint changes.

2. Header Based Version

 In this approach, the version is passed in the Header of the Request. Thus the endpoint always remains the same.
 
 Example:
 
 `http://localhost:8181/Api/Op` with ApiVersion: 1 in the Header.
 
 `http://localhost:8181/Api/Op` with ApiVersion: 2 in the Header.

3. Vendor MIME Type Version

 In this approach, the version is passed along as *Accept* parameter in the Request Header.
 
 Example:
 
 `http://localhost:8181/Api/Op` with Accept: application/vnd.melvins.v1+json
 
 `http://localhost:8181/Api/Op` with Accept: application/vnd.melvins.v2+json

