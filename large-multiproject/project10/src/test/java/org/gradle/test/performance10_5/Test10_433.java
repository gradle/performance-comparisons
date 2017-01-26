package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_433 {
    private final Production10_433 production = new Production10_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}