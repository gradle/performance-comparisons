package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_275 {
    private final Production10_275 production = new Production10_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}