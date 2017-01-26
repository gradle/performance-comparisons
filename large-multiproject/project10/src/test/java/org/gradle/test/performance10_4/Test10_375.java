package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_375 {
    private final Production10_375 production = new Production10_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}