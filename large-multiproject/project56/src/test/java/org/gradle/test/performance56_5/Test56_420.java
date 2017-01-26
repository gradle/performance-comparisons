package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_420 {
    private final Production56_420 production = new Production56_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}