package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_156 {
    private final Production56_156 production = new Production56_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}