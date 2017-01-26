package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_428 {
    private final Production56_428 production = new Production56_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}