package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_20 {
    private final Production56_20 production = new Production56_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}