package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_352 {
    private final Production21_352 production = new Production21_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}