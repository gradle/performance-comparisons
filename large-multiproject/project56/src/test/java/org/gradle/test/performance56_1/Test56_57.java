package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_57 {
    private final Production56_57 production = new Production56_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}