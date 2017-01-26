package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_250 {
    private final Production56_250 production = new Production56_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}