package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_332 {
    private final Production56_332 production = new Production56_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}