package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_421 {
    private final Production48_421 production = new Production48_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}