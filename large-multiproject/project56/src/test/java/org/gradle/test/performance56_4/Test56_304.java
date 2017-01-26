package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_304 {
    private final Production56_304 production = new Production56_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}