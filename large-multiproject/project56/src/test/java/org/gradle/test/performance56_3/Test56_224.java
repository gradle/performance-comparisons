package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_224 {
    private final Production56_224 production = new Production56_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}