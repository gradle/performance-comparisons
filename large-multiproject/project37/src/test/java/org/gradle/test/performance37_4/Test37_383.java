package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_383 {
    private final Production37_383 production = new Production37_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}