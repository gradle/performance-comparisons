package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_38 {
    private final Production56_38 production = new Production56_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}