package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_19 {
    private final Production56_19 production = new Production56_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}