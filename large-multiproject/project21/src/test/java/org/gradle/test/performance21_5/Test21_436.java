package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_436 {
    private final Production21_436 production = new Production21_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}