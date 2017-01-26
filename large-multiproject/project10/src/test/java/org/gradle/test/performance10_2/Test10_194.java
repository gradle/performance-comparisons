package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_194 {
    private final Production10_194 production = new Production10_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}