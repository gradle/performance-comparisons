package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_396 {
    private final Production56_396 production = new Production56_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}