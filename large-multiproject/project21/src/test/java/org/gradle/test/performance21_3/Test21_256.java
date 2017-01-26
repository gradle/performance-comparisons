package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_256 {
    private final Production21_256 production = new Production21_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}