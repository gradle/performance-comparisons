package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_261 {
    private final Production48_261 production = new Production48_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}