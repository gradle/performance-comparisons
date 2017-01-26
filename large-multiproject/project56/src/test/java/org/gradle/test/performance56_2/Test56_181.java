package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_181 {
    private final Production56_181 production = new Production56_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}