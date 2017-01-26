package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_22 {
    private final Production56_22 production = new Production56_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}