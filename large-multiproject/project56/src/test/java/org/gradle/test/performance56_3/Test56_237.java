package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_237 {
    private final Production56_237 production = new Production56_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}