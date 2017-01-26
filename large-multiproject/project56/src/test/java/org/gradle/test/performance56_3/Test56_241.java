package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_241 {
    private final Production56_241 production = new Production56_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}