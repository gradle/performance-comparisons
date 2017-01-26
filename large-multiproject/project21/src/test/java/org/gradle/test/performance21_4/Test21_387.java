package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_387 {
    private final Production21_387 production = new Production21_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}