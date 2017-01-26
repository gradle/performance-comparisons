package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_430 {
    private final Production56_430 production = new Production56_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}