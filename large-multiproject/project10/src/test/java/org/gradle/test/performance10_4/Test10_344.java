package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_344 {
    private final Production10_344 production = new Production10_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}