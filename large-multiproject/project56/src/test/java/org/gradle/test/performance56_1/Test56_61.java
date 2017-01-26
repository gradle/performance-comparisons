package org.gradle.test.performance56_1;

import static org.junit.Assert.*;

public class Test56_61 {
    private final Production56_61 production = new Production56_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}