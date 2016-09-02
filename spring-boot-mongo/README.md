For this example please use mongoDB.
Simply create a db called myjournal and collection journal and insert few records inside:

{
    "_id" : ObjectId("56b0ef2d77c8a628197f0aa4"),
    "_class" : "com.apress.spring.domain.Journal",
    "title" : "Get to know Spring Boot",
    "created" : ISODate("2016-01-02T07:00:00.000Z"),
    "summary" : "Today I will learn Spring Boot"
}

{
    "_id" : ObjectId("56b0ef2d77c8a628197f0aa5"),
    "_class" : "com.apress.spring.domain.Journal",
    "title" : "Simple Spring Boot Project",
    "created" : ISODate("2016-01-03T07:00:00.000Z"),
    "summary" : "I will do my first Spring Boot Project"
}

{
    "_id" : ObjectId("56b0ef2d77c8a628197f0aa6"),
    "_class" : "com.apress.spring.domain.Journal",
    "title" : "Spring Boot Reading",
    "created" : ISODate("2016-02-02T07:00:00.000Z"),
    "summary" : "Read more about Spring Boot"
}

{
    "_id" : ObjectId("56b0ef2d77c8a628197f0aa7"),
    "_class" : "com.apress.spring.domain.Journal",
    "title" : "Spring Boot in the Cloud",
    "created" : ISODate("2016-03-01T07:00:00.000Z"),
    "summary" : "Spring Boot using Cloud Foundry"
}