package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_383 {
    private final Production25_383 production = new Production25_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}