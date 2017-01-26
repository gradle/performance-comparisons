package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_335 {
    private final Production56_335 production = new Production56_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}