package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_115 {
    private final Production10_115 production = new Production10_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}