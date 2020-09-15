# enrollee-service


This is a take home assignment by Centene. The below are the project requirements were provided by Centene. 
```
# The challenge

Using Spring Boot or Go, and your database of choice (PostgreSQL, MySQL, MongoDB -- any you'd like), develop a microservice for tracking the status of enrollees in a health care program.
- Enrollees must have an id, name, and activation status (true or false), and a birth date
- Enrollees may have a phone number (although they do not have to supply this)
- Enrollees may have zero or more dependents
- Each of an enrollee's dependents must have an id, name, and birth date

The application we will be building will need to be able to do these things:
- Add a new enrollee
- Modify an existing enrollee
- Remove an enrollee entirely
- Add dependents to an enrollee
- Remove dependents from an enrollee
- Modify existing dependents
```

This is a REST service which performs the above logic, the API is barebones of the requirement. The data has to be imported before testing.

## Getting Started

Clone this repository into your local or host machinne using this link https://github.com/venkateshreddypala/enrollee-service.git

### Prerequisites

What things you need to install the software and how to install them

```
Java
Maven
Mongo
Docker
```

### Installing

 Download Java 1.8 and greater (Open JDK prefered)and maven.

```
./src mvn clean build
```

### Test
Use postman to test the rest end points

```
> HTTP Method	Available URI	Summary
- POST	/enrollee To post a Enrollee into the System.
- GET	/enrollee/{id}	To get a specific enrollee detail.
- PATCH	/update/{id}	To update the details of all the enrollee.
- DELETE	/enrollee/{id}	To delete a enrollee detail.
- POST /dependents/{id} To post a dependent to an existing enrollee.
```

### URI Method summary

Example Model to create a new enrollee using POST method:

```
{
  "name": "string",
  "status": "boolean",
  "dateOfBirth": "string",
  "phone": "string"
}
```
Example Model to create a new dependent using POST method:

```
{
  "name": "string",
  "dateOfBirth": "string",
}
```

Example model outputs the following using GET method
```
- "status" - This is a boolean, which checks the existing status
- "name" - This is an array to insert name when a new enrollee is created in the system

```
## Deployment
```
> Base URI: http://localhost:8080/
```

## Built With
```
* [Java] (https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java Platform
* [Maven](https://maven.apache.org/) - Dependency Management
* [Postman](https://www.getpostman.com/)- HTTP client to test the REST calls
```

## Authors

* **Venkatesh Pala** - *Initial work* 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

