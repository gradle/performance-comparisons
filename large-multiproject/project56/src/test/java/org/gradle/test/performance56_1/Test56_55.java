package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_55 {
    private final Production56_55 production = new Production56_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}