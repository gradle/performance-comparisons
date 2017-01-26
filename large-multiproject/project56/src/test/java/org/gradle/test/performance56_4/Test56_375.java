package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_375 {
    private final Production56_375 production = new Production56_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}