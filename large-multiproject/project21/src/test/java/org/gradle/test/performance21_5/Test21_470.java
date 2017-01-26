package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_470 {
    private final Production21_470 production = new Production21_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}