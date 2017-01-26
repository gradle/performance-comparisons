package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_208 {
    private final Production21_208 production = new Production21_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}