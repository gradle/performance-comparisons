package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_236 {
    private final Production21_236 production = new Production21_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}