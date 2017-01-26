package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_16 {
    private final Production56_16 production = new Production56_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}