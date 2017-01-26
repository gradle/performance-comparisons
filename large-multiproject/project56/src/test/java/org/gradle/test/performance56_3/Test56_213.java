package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_213 {
    private final Production56_213 production = new Production56_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}