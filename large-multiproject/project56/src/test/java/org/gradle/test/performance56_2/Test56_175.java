package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_175 {
    private final Production56_175 production = new Production56_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}