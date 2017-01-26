package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_435 {
    private final Production56_435 production = new Production56_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}