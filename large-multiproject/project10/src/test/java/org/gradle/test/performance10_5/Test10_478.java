package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_478 {
    private final Production10_478 production = new Production10_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}