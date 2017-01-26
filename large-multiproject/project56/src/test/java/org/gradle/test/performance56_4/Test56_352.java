package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_352 {
    private final Production56_352 production = new Production56_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}