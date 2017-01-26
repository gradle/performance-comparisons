package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_389 {
    private final Production56_389 production = new Production56_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}