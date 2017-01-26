package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_441 {
    private final Production21_441 production = new Production21_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}