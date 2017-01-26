package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_120 {
    private final Production56_120 production = new Production56_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}