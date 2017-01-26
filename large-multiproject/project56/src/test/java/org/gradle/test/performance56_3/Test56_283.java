package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_283 {
    private final Production56_283 production = new Production56_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}