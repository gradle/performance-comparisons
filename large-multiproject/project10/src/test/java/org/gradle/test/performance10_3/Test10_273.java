package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_273 {
    private final Production10_273 production = new Production10_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}