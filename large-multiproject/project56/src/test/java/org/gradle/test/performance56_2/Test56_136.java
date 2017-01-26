package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_136 {
    private final Production56_136 production = new Production56_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}