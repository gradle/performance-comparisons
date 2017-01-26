package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_346 {
    private final Production56_346 production = new Production56_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}