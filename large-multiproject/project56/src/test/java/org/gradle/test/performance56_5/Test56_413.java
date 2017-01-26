package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_413 {
    private final Production56_413 production = new Production56_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}