package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_316 {
    private final Production21_316 production = new Production21_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}