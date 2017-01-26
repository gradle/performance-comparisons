package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_243 {
    private final Production56_243 production = new Production56_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}