package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_383 {
    private final Production58_383 production = new Production58_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}