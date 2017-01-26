package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_41 {
    private final Production56_41 production = new Production56_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}