package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_223 {
    private final Production21_223 production = new Production21_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}