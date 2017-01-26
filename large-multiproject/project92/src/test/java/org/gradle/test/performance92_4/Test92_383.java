package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_383 {
    private final Production92_383 production = new Production92_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}