package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_230 {
    private final Production56_230 production = new Production56_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}