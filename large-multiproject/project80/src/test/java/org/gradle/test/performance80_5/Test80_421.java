package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_421 {
    private final Production80_421 production = new Production80_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}