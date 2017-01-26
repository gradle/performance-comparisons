package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_359 {
    private final Production10_359 production = new Production10_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}