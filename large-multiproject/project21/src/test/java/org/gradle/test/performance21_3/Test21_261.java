package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_261 {
    private final Production21_261 production = new Production21_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}