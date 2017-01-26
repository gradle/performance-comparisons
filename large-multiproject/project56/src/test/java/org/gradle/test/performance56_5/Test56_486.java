package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_486 {
    private final Production56_486 production = new Production56_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}