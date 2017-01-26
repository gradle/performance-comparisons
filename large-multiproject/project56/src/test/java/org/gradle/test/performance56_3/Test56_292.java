package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_292 {
    private final Production56_292 production = new Production56_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}