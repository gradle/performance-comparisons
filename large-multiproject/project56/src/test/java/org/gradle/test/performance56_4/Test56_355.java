package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_355 {
    private final Production56_355 production = new Production56_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}