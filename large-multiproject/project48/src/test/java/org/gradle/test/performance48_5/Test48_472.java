package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_472 {
    private final Production48_472 production = new Production48_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}