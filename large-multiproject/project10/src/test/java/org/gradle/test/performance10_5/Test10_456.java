package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_456 {
    private final Production10_456 production = new Production10_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}