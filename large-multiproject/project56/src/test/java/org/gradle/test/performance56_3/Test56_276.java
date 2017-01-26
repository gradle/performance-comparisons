package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_276 {
    private final Production56_276 production = new Production56_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}