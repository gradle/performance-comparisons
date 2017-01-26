package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_467 {
    private final Production21_467 production = new Production21_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}