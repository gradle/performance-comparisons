package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_232 {
    private final Production56_232 production = new Production56_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}