package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_409 {
    private final Production56_409 production = new Production56_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}