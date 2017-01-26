package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_226 {
    private final Production56_226 production = new Production56_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}