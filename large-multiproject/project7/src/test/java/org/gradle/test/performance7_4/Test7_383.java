package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_383 {
    private final Production7_383 production = new Production7_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}