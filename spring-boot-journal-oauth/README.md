https://spring.io/guides/tutorials/spring-boot-oauth2/

The format for passing the client’s credential is -u <clientId>:<secret>

```
...
security.oauth2.client.clientId = acd167f6-04f8-4306-a118-03e2356f73aa
security.oauth2.client.secret = 2dd4bec5-fe62-4568-94a1-c31ac3c4eb4e
...

$ curl -i localhost:8080/oauth/token -d "grant_type=password&scope=read&username=springboot&password=isawesome" -u 6f15a540-3e3d-45eb-a787-381c563c9bce:73c98dd5-ff23-4806-b327-84327d6a7f1e

HTTP/1.1 200
X-Application-Context: application
Cache-Control: no-store
Pragma: no-cache
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
X-Frame-Options: DENY
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Tue, 06 Sep 2016 08:19:17 GMT
Proxy-Connection: keep-alive
Connection: keep-alive

{"access_token":"575dfb64-9c95-4bbd-90d6-4328a385900a","token_type":"bearer","refresh_token":"c4034458-bd71-47df-83b4-b4c5e54406ac","expires_in":43199,"scope":"read"}

$ curl -i -H "Authorization: bearer 575dfb64-9c95-4bbd-90d6-4328a385900a" localhost:8080/api -u 6f15a540-3e3d-45eb-a787-381c563c9bce:73c98dd5-ff23-4806-b327-84327d6a7f1e
```

http://github.com/felipeg48/pro-spring-boot