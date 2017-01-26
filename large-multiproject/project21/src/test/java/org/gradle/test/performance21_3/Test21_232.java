package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_232 {
    private final Production21_232 production = new Production21_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}