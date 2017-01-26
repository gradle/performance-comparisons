package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_6 {
    private final Production56_6 production = new Production56_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}