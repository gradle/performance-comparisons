package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_279 {
    private final Production56_279 production = new Production56_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}