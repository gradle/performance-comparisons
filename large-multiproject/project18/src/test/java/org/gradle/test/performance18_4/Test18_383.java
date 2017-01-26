package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_383 {
    private final Production18_383 production = new Production18_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}