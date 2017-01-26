package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_412 {
    private final Production56_412 production = new Production56_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}