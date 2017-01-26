package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_370 {
    private final Production56_370 production = new Production56_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}