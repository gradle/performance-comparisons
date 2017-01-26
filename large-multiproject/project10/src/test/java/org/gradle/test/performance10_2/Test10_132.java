package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_132 {
    private final Production10_132 production = new Production10_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}