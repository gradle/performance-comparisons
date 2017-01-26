package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_264 {
    private final Production56_264 production = new Production56_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}