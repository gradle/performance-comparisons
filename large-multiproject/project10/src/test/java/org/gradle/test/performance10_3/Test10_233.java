package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_233 {
    private final Production10_233 production = new Production10_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}