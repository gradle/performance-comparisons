package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_499 {
    private final Production56_499 production = new Production56_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}