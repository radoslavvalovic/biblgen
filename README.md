next video: https://www.youtube.com/watch?v=yGeI_WORmco

mvn spring-boot:run
GET http://localhost:8080/topics
PUT http://localhost:8080/topics/javascript
Body: raw[{"key":"Content-Type","value":"application/json","description":""}]
    {
        "id": "javascript",
        "name": "JavaScript",
        "description": "JS desc"
    }
headers: [{"key":"Content-Type","value":"application/json","description":""}]
GET http://localhost:8080/topics/javascript
DELETE http://localhost:8080/topics/java