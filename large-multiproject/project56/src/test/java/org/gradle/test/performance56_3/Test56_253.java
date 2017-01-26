package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_253 {
    private final Production56_253 production = new Production56_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}