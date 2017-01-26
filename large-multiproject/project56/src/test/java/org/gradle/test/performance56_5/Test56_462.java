package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_462 {
    private final Production56_462 production = new Production56_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}