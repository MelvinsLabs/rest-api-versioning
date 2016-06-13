
[![Dependency Status](https://www.versioneye.com/user/projects/575e32707757a00041b3b916/badge.svg?style=flat)](https://www.versioneye.com/user/projects/575e32707757a00041b3b916)

# ReadMe

This Project demonstrates various ways to version the REST API.

## Strategies

**1. URL Based Version**

 In this approach, the version is mentioned in the URL and thus the endpoint.
 
 Example:
 
 `http://localhost:8181/Api/Op/v1`
 
 `http://localhost:8181/Api/Op/v2`

 _Cons_
 
 - The endpoint changes, which makes it not suitable for User based APIs.
 - Major/Minor combined Version Implementation at Controller is not possible, as it is versioned based on resource path.


**2. Header Based Version**

 In this approach, the version is passed in the Header of the Request. Thus the endpoint always remains the same.
 
 Example:
 
 `http://localhost:8181/Api/Op` with ApiVersion: 1 in the Header.
 
 `http://localhost:8181/Api/Op` with ApiVersion: 2 in the Header.

 _Cons_

 - Major/Minor combined Version Implementation at Controller is not possible, as it is versioned based on single Header.
 - Not suitable for varying API Contracts across multiple versions.

**3. Vendor MIME Type Version**

 In this approach, the version is passed along as _Accept_ parameter in the Request Header.
 
 Example:
 
 `http://localhost:8181/Api/Op` with Accept: application/vnd.melvins.v1+json
 
 `http://localhost:8181/Api/Op` with Accept: application/vnd.melvins.v2+json

 _Cons_

 - Not suitable for varying API Contracts across multiple versions, but can be done.