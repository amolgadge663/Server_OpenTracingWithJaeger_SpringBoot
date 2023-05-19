# Server_OpenTracingWithJaeger_SpringBoot
Server-side app for Open Tracing with Jaeger Spring Boot Project

# This Repo needs to run with Client_OpenTracingWithJaeger_SpringBoot
https://github.com/amolgadge663/Client_OpenTracingWithJaeger_SpringBoot 
## Need to configure the Docker Desktop 
1. Download and Install Docker Desktop
2. Run Docker and hit cmd -> docker pull jaegertracing/all-in-one
3. Run command for running Jaeger $ docker run -d --name jaeger -p 16686:16686 -p 6831:6831/udp jaegertracing/all-in-one:1.9
4. Open Jaeger Console on broswer http://localhost:16686/ 
5. Start Both the Applications Client and Server
6. Hit Client API http://localhost:8081/jaeger/client/{ID}
Note. {ID} replace ID with any Integer

