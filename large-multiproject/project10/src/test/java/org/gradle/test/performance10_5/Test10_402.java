package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_402 {
    private final Production10_402 production = new Production10_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}