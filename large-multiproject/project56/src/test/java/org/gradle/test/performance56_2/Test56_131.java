package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_131 {
    private final Production56_131 production = new Production56_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}