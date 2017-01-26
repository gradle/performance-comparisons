package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_363 {
    private final Production56_363 production = new Production56_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}