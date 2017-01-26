package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_429 {
    private final Production56_429 production = new Production56_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}