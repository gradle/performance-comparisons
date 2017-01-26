package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_169 {
    private final Production21_169 production = new Production21_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}