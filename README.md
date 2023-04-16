## spring-cache

POC inicial do uso de cache em aplicações Spring Boot.

## Comandos

1 - Comando utilizado para rodar o redis

```
docker run --name redis_local -p 6379:6379 -d redis
```

2 - Após rodar a aplicação caso deseje verificar como ficou o redis

2.1 - Executar um comando dentro da imagem docker.

```
docker exec -it redis_local sh
```
2.2 - Roda o client do redis.

```
redis-cli
```

2.3 - Verificar os valores armazenados no redis.
```
keys *
```

2.4. Consulta um das chaves armazenadas no redis. Vai ser exibido o valor deserializado.
```
get products::1
```

## Referência

[Youtube - # Aprenda a usar cache nos seus projetos Spring Boot! ](https://www.youtube.com/watch?v=YcI9b-lgi7w&t=120s)


```
