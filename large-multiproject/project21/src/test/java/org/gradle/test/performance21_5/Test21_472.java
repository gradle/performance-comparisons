package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_472 {
    private final Production21_472 production = new Production21_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}