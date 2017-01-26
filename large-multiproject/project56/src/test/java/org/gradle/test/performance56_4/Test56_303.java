package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_303 {
    private final Production56_303 production = new Production56_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}