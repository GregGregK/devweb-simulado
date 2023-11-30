# Info geral
api criada por greg, em caso de cópia sei la ve o log ai de quem commitou primeiro e tmj

- Não foi solicitado DTO então fique a vontade para criar o seu, lembre-se de alterar o service e controller caso adicione um DTO




# Funcionamento 

## Inserção de roles no BD


MYSQL:\
INSERT INTO ROLE (NAME) VALUES("PRODUCT_SELECT");\
INSERT INTO ROLE (NAME) VALUES("PRODUCT_INSERT");\
INSERT INTO ROLE (NAME) VALUES("PRODUCT_UPDATE");\
INSERT INTO ROLE (NAME) VALUES("PRODUCT_DELETE");

POSTGRES:\
INSERT INTO ROLE (NAME) VALUES('PRODUCT_SELECT');\
INSERT INTO ROLE (NAME) VALUES('PRODUCT_INSERT');\
INSERT INTO ROLE (NAME) VALUES('PRODUCT_UPDATE');\
INSERT INTO ROLE (NAME) VALUES('PRODUCT_DELETE');


- Script postman para inserção de user para autenticação de rotas

```
{
"username": "admin",
"password": "123",
"roles":
[
{
"id": 1
},
{
"id": 2
},
{
"id": 3
},
{
"id": 4
}
]
} 
```

- Script para inserção de task no postman
``` 
{
  "title": "Titulo",
  "description": "Descrição",
  "completed": false
}

```

- Print de como fica salvo os usuários e suas senhas \
![img.png](img.png)

- Print de como fica as tasks\
![img_1.png](img_1.png)


- Print de como fica as roles \
![img_2.png](img_2.png)

- Print de como fica as users_roles \
[img_3.png](img_3.png) 


