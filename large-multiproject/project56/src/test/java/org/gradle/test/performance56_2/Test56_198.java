package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_198 {
    private final Production56_198 production = new Production56_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}