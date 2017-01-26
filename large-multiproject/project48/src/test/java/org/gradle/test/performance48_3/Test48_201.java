package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_201 {
    private final Production48_201 production = new Production48_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}