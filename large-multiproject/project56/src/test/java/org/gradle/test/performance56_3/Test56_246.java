package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_246 {
    private final Production56_246 production = new Production56_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}