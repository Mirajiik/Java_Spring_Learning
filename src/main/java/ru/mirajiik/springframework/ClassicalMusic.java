package ru.mirajiik.springframework;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }
}
