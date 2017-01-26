package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_436 {
    private final Production56_436 production = new Production56_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}