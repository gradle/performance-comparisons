package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_451 {
    private final Production56_451 production = new Production56_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}