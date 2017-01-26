package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_359 {
    private final Production56_359 production = new Production56_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}