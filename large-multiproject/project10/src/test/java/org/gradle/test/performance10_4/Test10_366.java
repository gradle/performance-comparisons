package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_366 {
    private final Production10_366 production = new Production10_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}