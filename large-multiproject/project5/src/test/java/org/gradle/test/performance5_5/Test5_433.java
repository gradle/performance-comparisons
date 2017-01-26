package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_433 {
    private final Production5_433 production = new Production5_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}