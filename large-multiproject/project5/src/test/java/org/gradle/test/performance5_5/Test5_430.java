package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_430 {
    private final Production5_430 production = new Production5_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}