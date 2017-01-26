package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_487 {
    private final Production56_487 production = new Production56_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}