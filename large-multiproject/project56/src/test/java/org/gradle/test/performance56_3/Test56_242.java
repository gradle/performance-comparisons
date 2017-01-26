package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_242 {
    private final Production56_242 production = new Production56_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}