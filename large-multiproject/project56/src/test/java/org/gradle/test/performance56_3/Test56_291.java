package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_291 {
    private final Production56_291 production = new Production56_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}