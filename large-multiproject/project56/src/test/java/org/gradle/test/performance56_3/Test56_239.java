package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_239 {
    private final Production56_239 production = new Production56_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}