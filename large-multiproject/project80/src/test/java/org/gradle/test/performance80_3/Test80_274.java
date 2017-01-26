package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_274 {
    private final Production80_274 production = new Production80_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}