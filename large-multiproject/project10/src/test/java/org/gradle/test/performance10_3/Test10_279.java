package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_279 {
    private final Production10_279 production = new Production10_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}