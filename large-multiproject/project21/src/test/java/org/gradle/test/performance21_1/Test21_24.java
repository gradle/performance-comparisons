package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_24 {
    private final Production21_24 production = new Production21_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}