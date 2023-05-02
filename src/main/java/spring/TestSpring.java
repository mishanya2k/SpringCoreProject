package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMusic music = context.getBean("rapMusic",IMusic.class);
        System.out.println(music.getSong() + " by " + music.getAuthor());
    }
}

