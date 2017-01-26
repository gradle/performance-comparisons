package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_13 {
    private final Production56_13 production = new Production56_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}