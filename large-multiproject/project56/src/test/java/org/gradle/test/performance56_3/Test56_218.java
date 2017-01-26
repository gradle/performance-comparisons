package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_218 {
    private final Production56_218 production = new Production56_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}