package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_21 {
    private final Production56_21 production = new Production56_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}