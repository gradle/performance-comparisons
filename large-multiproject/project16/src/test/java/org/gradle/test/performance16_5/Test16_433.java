package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_433 {
    private final Production16_433 production = new Production16_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}