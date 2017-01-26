package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_299 {
    private final Production21_299 production = new Production21_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}