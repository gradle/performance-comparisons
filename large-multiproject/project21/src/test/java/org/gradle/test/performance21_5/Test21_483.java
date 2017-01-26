package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_483 {
    private final Production21_483 production = new Production21_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}