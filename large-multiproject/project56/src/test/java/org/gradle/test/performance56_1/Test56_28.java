package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_28 {
    private final Production56_28 production = new Production56_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}