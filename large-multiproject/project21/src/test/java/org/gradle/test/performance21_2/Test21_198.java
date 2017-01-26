package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_198 {
    private final Production21_198 production = new Production21_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}