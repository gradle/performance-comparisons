package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_328 {
    private final Production56_328 production = new Production56_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}