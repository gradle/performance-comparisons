package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_284 {
    private final Production56_284 production = new Production56_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}