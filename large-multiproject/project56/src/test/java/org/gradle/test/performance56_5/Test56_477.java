package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_477 {
    private final Production56_477 production = new Production56_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}