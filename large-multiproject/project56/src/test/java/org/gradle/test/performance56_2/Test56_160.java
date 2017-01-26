package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_160 {
    private final Production56_160 production = new Production56_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}