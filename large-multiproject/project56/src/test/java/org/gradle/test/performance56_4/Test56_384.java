package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_384 {
    private final Production56_384 production = new Production56_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}