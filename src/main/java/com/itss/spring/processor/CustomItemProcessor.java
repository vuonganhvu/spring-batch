package com.itss.spring.processor;

import com.itss.spring.entities.Tutorial;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {

    @Override
    public Tutorial process(Tutorial tutorial) throws Exception {
        System.out.println(tutorial.toString());
        System.out.println("Processing...");
        return tutorial;
    }
}
