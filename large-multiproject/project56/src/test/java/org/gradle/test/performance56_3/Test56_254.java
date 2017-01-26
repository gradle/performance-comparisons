package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_254 {
    private final Production56_254 production = new Production56_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}