package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_196 {
    private final Production56_196 production = new Production56_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}