package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_32 {
    private final Production56_32 production = new Production56_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}