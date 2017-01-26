package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_344 {
    private final Production56_344 production = new Production56_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}