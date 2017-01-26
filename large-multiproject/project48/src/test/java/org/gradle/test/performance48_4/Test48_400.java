package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_400 {
    private final Production48_400 production = new Production48_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}