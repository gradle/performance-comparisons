package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_11 {
    private final Production56_11 production = new Production56_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}