package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_219 {
    private final Production21_219 production = new Production21_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}