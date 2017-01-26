package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_328 {
    private final Production10_328 production = new Production10_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}