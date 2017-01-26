package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_186 {
    private final Production56_186 production = new Production56_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}