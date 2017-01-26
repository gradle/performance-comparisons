package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_247 {
    private final Production21_247 production = new Production21_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}