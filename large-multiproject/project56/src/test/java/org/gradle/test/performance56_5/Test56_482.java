package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_482 {
    private final Production56_482 production = new Production56_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}