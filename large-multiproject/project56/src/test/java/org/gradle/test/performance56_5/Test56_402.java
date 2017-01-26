package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_402 {
    private final Production56_402 production = new Production56_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}