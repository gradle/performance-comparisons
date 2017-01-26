package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_247 {
    private final Production56_247 production = new Production56_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}