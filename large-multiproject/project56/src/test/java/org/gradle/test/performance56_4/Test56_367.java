package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_367 {
    private final Production56_367 production = new Production56_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}