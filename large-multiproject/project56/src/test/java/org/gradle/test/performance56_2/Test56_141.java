package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_141 {
    private final Production56_141 production = new Production56_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}