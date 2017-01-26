package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_383 {
    private final Production30_383 production = new Production30_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}