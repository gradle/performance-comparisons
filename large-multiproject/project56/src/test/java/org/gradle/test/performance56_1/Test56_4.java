package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_4 {
    private final Production56_4 production = new Production56_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}