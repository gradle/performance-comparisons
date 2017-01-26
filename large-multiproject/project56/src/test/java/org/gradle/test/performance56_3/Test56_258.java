package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_258 {
    private final Production56_258 production = new Production56_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}