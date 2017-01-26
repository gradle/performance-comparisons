package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_487 {
    private final Production10_487 production = new Production10_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}