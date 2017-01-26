package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_203 {
    private final Production56_203 production = new Production56_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}