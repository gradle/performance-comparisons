package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_354 {
    private final Production56_354 production = new Production56_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}