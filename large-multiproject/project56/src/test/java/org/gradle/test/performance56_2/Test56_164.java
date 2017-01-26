package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_164 {
    private final Production56_164 production = new Production56_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}