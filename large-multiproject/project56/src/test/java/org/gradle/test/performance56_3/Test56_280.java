package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_280 {
    private final Production56_280 production = new Production56_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}