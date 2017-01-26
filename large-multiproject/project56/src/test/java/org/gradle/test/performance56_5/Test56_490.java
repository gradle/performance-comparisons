package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_490 {
    private final Production56_490 production = new Production56_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}