package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_493 {
    private final Production56_493 production = new Production56_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}