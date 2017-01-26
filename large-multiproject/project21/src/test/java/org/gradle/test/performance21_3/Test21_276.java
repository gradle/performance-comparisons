package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_276 {
    private final Production21_276 production = new Production21_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}