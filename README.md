# zaglushka
1) git clone https://github.com/SIbasic/zaglushka
2) перейти в дир где находится pom.xml (demo)
3) mvn clear package (изменить в pom.xml на подходящюю версию java при необходимости)
4) cd target
5) java -jar demo-0.0.1-SNAPSHOT.jar
6) curl -i -X POST -H "Content-Type: application/json" -d '{"name":"ABOBA","age":"23"}' http://localhost:8080/test/postmethod/json (заглушка обрабатывает 2 переменные name, age)
6.1) curl -i -X POST -H "Content-Type: application/json" -d "{\"name\":\"ABOBA\"}" http://localhost:8080/test/postmethod/json (для Windows)
