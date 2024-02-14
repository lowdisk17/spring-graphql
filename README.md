# spring-graphql
A simple project to kickstart your spring boot and graphql journey

Note: In testing
1. Run the application by using any idea of your choice (example VSCode)
2. By using postman or any other testing application you can check the validity of the application. Paste the following info accordingly
   Endpoint :
     http://localhost:8080/graphql
   Query : 
     query {
        movieById(id: 1) {
          id
          title
          year
          genres
          director
        }
        actorById(id: 1) {
          id
          name
        }
      }
4. Sample Response
   {
    "data": {
        "movieById": {
            "id": "1",
            "title": "Die Hard",
            "year": 1988,
            "genres": [ "Action" ],
            "director": "John McTiernan"
        },
        "actorById": {
            "id": "1",
            "name": "Bruce Willis"
        }
    }
  }
