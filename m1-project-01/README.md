# Азбука Морзе

// USE Case 1: Кодирование файла

// USE Case 2: Декодирование файла

1. Core - бизнес логика, константы 
   [Alphabet.java](../../crypto-analize/src/main/java/com/javarush/сaesar/core/Alphabet.java)  
   [MorseCoder.java](../../crypto-analize/src/main/java/com/javarush/сaesar/core/MorseCoder.java)  

2. Model (Domain) - модель данных 
   [ProcessingResult.java](../../crypto-analize/src/main/java/com/javarush/сaesar/model/ProcessingResult.java)  
3. Service - работа с файлами, валидация 
   [ValidationService.java](../../crypto-analize/src/main/java/com/javarush/сaesar/service/ValidationService.java)  
   [FileService.java](../../crypto-analize/src/main/java/com/javarush/сaesar/service/FileService.java)  
4. Exception - кастомные исключения для нашей логики 
   [MorseException.java](../../crypto-analize/src/main/java/com/javarush/сaesar/exception/MorseException.java)  
5. Ресурсы - настройки 
   [config.properties](../../crypto-analize/src/main/resources/config.properties)  

// Тесты - для покрытия логики 