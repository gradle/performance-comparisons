package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_492 {
    private final Production56_492 production = new Production56_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}