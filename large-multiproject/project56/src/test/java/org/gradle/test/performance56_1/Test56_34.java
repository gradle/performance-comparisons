package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_34 {
    private final Production56_34 production = new Production56_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}