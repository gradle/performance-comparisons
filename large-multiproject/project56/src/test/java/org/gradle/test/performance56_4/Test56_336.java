package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_336 {
    private final Production56_336 production = new Production56_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}