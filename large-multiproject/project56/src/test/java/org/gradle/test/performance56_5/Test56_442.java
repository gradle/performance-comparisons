package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_442 {
    private final Production56_442 production = new Production56_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}