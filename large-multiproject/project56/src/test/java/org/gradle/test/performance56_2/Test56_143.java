package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_143 {
    private final Production56_143 production = new Production56_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}