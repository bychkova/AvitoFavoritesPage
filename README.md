# Задание 1. Тест-план
[План тестирования](https://docs.google.com/spreadsheets/d/16qxzSUfDlbdwhk42VtQjbfrol8NWuq9Pu4WWGs8MK_4/edit?usp=sharing) для функциональности “Избранное” для трёх объявлений из разных категорий.

# Задание 2. Автотест
Автотест проверяет добавление в избранное [объявления](https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363) с карточки объявления.
Стек: Java, Selenium.

## Окружение
Тест написан для проверки работы функционала на Desktop-версии в браузере Chrome, версия 116.0.5845.110 (Официальная сборка), (arm64).

## Запуск теста
- склонировать репозиторий `git clone https://github.com/bychkova/AvitoFavoritesPage.git`
- установить [Maven](https://maven.apache.org/download.cgi)
- скачать [WebDriver](https://chromedriver.chromium.org/downloads), версия должна совпадать с версией браузера, в котором будет проводиться тестироване
- в классе [SeleniumPage.java](https://github.com/bychkova/AvitoFavoritesPage/blob/main/src/test/java/base/SeleniumPage.java) изменить путь к ChromeDriver на путь к WebDriver на вашем компьютере
- открыть папку в терминале или командной строке, выполнить команду `mvn test`
