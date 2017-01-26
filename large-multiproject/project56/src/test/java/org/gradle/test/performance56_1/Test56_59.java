package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_59 {
    private final Production56_59 production = new Production56_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}