package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_35 {
    private final Production56_35 production = new Production56_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}