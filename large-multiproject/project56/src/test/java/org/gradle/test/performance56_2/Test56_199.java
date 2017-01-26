package org.gradle.test.performance56_2;

import static org.junit.Assert.*;

public class Test56_199 {
    private final Production56_199 production = new Production56_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}