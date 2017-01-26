package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_221 {
    private final Production56_221 production = new Production56_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}