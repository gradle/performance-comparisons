package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_245 {
    private final Production10_245 production = new Production10_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}