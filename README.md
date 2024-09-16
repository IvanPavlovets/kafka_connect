# kafka_connect
**Простой вариант использования Kafka**<br>
Отправляем простое сообщения типа String от Постащика Потребителю<br>

Порядок запуска:<br>
~ запускаем связку приложений ZooKeeper и Kafka c помощью start.bat<br>
(батник, последовательно, запускающий ZooKeeper и Kafka)<br>
~ запускаем приложение<br>
src/main/java/com/example/kafka_connect/KafkaConnectApplication.java<br>
~ запускаем Postman<br>

В Postman создаем запрос типа Post:<br>
адрес: http://localhost:8080/msg<br>
Body (form-data)<br>
key: msgId value: string_id<br>
key:msg value: Hello, world<br>
Запрос прошёл - Status 200 Ok<br>

**Более сложный вариант использования Kafka**<br>
Отправляем Потребителю объект UserDTO<br>

Немного усложним наш проект и представим, что нам нужно<br>
отправить Потребителю объект (передать модель) UserDTO<br>

Порядок запуска (как и в простом случае):<br>
~ запускаем связку приложений ZooKeeper и Kafka c помощью start.bat<br>
~ запускаем приложение<br>
~ запускаем Postman<br>


В Postman создаем запрос типа Post для передачи юзера :<br>
адрес: http://localhost:8080/user<br>
Body (form-data)<br>
key: msgId value: 12345<br>
key:name value: Vasya<br>
key:age value: 15<br>
Запрос прошёл - Status 200 Ok<br>

![](images/contents.jpg) <br>
Рисунок 1. Оглавление <br>
## О проекте

