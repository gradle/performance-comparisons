package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_248 {
    private final Production56_248 production = new Production56_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}