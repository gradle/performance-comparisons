package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_376 {
    private final Production10_376 production = new Production10_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}