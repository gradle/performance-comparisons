package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_385 {
    private final Production56_385 production = new Production56_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}