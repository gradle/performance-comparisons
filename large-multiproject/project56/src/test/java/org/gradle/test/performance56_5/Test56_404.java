package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_404 {
    private final Production56_404 production = new Production56_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}