package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_423 {
    private final Production56_423 production = new Production56_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}