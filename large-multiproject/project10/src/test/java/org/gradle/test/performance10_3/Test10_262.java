package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_262 {
    private final Production10_262 production = new Production10_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}