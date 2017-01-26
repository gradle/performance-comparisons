package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_271 {
    private final Production56_271 production = new Production56_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}