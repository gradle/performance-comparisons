package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_216 {
    private final Production56_216 production = new Production56_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}