package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_78 {
    private final Production56_78 production = new Production56_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}