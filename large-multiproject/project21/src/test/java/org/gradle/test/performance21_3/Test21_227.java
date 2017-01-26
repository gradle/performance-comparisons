package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_227 {
    private final Production21_227 production = new Production21_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}