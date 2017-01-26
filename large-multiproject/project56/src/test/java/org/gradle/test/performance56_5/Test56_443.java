package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_443 {
    private final Production56_443 production = new Production56_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}