package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_365 {
    private final Production56_365 production = new Production56_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}