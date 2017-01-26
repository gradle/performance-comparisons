package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_399 {
    private final Production56_399 production = new Production56_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}