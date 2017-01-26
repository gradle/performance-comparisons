package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_236 {
    private final Production48_236 production = new Production48_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}