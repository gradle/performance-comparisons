package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_455 {
    private final Production56_455 production = new Production56_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}