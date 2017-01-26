package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_139 {
    private final Production56_139 production = new Production56_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}