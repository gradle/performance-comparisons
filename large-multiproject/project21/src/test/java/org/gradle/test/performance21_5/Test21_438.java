package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_438 {
    private final Production21_438 production = new Production21_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}