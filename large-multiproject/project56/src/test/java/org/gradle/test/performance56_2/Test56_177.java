package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_177 {
    private final Production56_177 production = new Production56_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}