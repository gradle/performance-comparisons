package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_248 {
    private final Production10_248 production = new Production10_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}