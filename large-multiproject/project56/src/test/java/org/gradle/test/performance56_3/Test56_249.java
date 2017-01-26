package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_249 {
    private final Production56_249 production = new Production56_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}