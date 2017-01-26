package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_371 {
    private final Production56_371 production = new Production56_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}