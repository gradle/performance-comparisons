package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_261 {
    private final Production56_261 production = new Production56_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}