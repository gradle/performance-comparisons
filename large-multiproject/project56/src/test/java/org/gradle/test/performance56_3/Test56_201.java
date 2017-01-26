package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_201 {
    private final Production56_201 production = new Production56_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}