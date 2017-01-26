package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_318 {
    private final Production56_318 production = new Production56_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}