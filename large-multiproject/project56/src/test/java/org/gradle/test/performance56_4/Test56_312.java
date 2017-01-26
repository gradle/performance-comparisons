package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_312 {
    private final Production56_312 production = new Production56_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}