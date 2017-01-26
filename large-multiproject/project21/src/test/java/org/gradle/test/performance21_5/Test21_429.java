package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_429 {
    private final Production21_429 production = new Production21_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}