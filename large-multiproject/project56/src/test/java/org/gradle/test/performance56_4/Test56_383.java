package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_383 {
    private final Production56_383 production = new Production56_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}