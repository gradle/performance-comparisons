package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_329 {
    private final Production56_329 production = new Production56_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}