package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_23 {
    private final Production56_23 production = new Production56_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}