# Задание 2
#### В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы решили написать сервис, который рассчитывает индекс массы тела (body mass index).

Формулу расчёта bmi-индекса вам предстоит найти самостоятельно. Сервисный метод должен возвращать целое число. Чтобы дробное превратить в целое, можете использовать приведение типов: `(int) index`, где `index` имеет дробный тип. Пример для самопроверки: для роста 1.87 метра и веса 98 кг он будет 28.

1. Создайте класс `BmiService` с методом `calculate`:

- Принимает все нужные данные в параметрах;
- В названии параметров указаны единицы измерения, например, в метрах ли вы принимаете рост;
- Метод возвращает посчитанный bmi-индекс в виде целого числа.
2. Продемонстрировать в `Main` по аналогии с первой задачей:

- создание объекта;
- вызов метода `calculate`;
- печать в консоль результата, проверьте, что ваша программа считает правильно, сравнив его со своими примерами.
