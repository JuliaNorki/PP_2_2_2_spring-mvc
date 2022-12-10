package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() { // этот метод не используется
        return null;
    }


    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() { // здесь подставляем класс WebConfig
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // это эквивалентно тому что мы в файле web.xml все запросы от пользователя отправляем на диспетчерсервлет
    }

}

//<dependency> // эта зависимость используется абстрактным классом AbstractAnnotationConfigDispatcherServletInitializer;
//
//<groupId>javax.servlet</groupId>
//<artifactId>javax.servlet-api</artifactId>
//<version>4.0.1</version>
//<scope>provided</scope>
//</dependency>