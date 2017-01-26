package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_120 {
    private final Production21_120 production = new Production21_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}