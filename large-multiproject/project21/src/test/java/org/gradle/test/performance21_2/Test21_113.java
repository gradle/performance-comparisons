package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_113 {
    private final Production21_113 production = new Production21_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}