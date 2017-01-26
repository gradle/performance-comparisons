package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_489 {
    private final Production56_489 production = new Production56_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}