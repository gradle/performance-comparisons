package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_87 {
    private final Production56_87 production = new Production56_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}