package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_381 {
    private final Production56_381 production = new Production56_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}