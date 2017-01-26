package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_274 {
    private final Production48_274 production = new Production48_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}