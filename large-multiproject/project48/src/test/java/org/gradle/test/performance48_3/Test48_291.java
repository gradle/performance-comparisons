package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_291 {
    private final Production48_291 production = new Production48_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}