package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_430 {
    private final Production10_430 production = new Production10_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}