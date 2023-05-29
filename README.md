# Втора лабораториска вежба по предметот Софтверско Инженерство
## Немања Трајановски 213239
### Control Flow Graph

![SI-lab2](https://github.com/nemanjaTra/SI_2023_lab2_213239/assets/127133275/1104f311-0174-436b-84c3-b2c10157e6aa)


### Цикломатската комплексност
  Бр на ребра - Бр на јазли + 2 -> 31 - 22 + 2 = 11 </br>
  Бр на региони + 1 ->  10 + 1 = 11  
### Тест случаи според критериумот Every Branch

1- user = null ; allUsers = x.</br>
2 - user.username = 'username'; user.email= 'none'; user.pass = '098765432'; allUsers = [x].</br>
3- user.username = null; user.email = hello@yahoo.com; user.pass= '09876'; allUSers =[raz,raz,isto].</br>
4- user.pass= '098 765432'; allUSers = [].</br>
5- user.username= 'username'; user.email= 'none'; user.pass= '0987654@&'; allUSers = [].  
#### x- било кој
#### raz- различни корисници
#### same- ист корисник 
### Тест случаи според критериумот Multiple Condition
1- user = null.</br>
2- user != null ; password = null.</br>
3- user != null ; email != null ; password != null.</br>
4- user != null ; email = null ; password !=null .

### Објаснување на напишаните Unit Tests


