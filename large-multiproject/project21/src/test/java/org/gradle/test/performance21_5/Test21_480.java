package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_480 {
    private final Production21_480 production = new Production21_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}