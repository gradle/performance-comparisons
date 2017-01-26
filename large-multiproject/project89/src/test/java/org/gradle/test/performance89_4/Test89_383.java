package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_383 {
    private final Production89_383 production = new Production89_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}