package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_327 {
    private final Production10_327 production = new Production10_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}