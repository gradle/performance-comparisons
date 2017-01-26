package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_52 {
    private final Production56_52 production = new Production56_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}