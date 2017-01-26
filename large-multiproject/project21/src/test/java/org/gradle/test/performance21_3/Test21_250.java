package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_250 {
    private final Production21_250 production = new Production21_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}