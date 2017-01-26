package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_345 {
    private final Production21_345 production = new Production21_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}