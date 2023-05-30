package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Bean(name = "cat")
    public Cat getCat() {
        Cat cat = new Cat();
        return cat;
    }

    @Bean(name = "dog")
    public Dog getDog() {
        Dog dog = new Dog();
        return dog;
    }

    @Bean
    public Timer getT() {
        Timer timer = new Timer();
        return timer;
    }

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    @Qualifier("cat")
    private Animal animal1;

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");

        System.out.println("Say:");
        System.out.println(animal1.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
    }
}