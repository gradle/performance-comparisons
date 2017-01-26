package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_373 {
    private final Production56_373 production = new Production56_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}