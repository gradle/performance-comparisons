package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_37 {
    private final Production56_37 production = new Production56_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}