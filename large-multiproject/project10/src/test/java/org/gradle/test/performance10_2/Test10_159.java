package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_159 {
    private final Production10_159 production = new Production10_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}