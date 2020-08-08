Этот репозиторий - пример содания REST CRUD приложения используя Spring Boot.
Ваша сегодняшняя задача создать приложение Soccer, в нем должны быть использованы две сущности:
1) Team
2) Player
В каждой команде должны быть определены следующие свойства: страна(String), город(String) и уникальное имя.
В каждом игроке должны быть определены следующие свойства: имя(String), позиция на которой игрок играет(String) и уникальное имя.
Приложение должно давать возможность выполнять все CRUD операции через REST как для команды так и для игрока.
Также ваша программа должна иметь следующие функции доступные по REST: 
1) найти является ли команда полной(колличество людей в команде 11 и более)
2) найти всех игроков команды по имени команды
3) найти всех игроков команды по имени команды и позиции на которой эти игроки играют
