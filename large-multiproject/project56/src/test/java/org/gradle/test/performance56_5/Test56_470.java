package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_470 {
    private final Production56_470 production = new Production56_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}