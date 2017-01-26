package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_277 {
    private final Production10_277 production = new Production10_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}