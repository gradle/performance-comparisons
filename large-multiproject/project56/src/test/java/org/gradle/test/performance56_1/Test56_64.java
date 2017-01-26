package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_64 {
    private final Production56_64 production = new Production56_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}