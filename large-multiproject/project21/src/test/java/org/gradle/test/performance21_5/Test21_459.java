package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_459 {
    private final Production21_459 production = new Production21_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}