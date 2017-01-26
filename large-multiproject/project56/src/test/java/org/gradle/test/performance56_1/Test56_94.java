package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_94 {
    private final Production56_94 production = new Production56_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}