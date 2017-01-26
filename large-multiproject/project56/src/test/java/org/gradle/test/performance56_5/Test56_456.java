package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_456 {
    private final Production56_456 production = new Production56_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}