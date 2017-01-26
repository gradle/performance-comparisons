package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_383 {
    private final Production10_383 production = new Production10_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}