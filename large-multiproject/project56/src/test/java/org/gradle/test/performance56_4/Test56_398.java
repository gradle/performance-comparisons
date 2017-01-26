package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_398 {
    private final Production56_398 production = new Production56_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}