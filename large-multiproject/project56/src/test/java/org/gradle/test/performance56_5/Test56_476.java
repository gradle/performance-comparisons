package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_476 {
    private final Production56_476 production = new Production56_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}