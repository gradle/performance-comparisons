package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_489 {
    private final Production21_489 production = new Production21_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}