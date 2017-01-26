package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_322 {
    private final Production56_322 production = new Production56_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}