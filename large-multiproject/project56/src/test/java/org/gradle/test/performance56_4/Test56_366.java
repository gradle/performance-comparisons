package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_366 {
    private final Production56_366 production = new Production56_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}